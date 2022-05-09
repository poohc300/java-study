package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;

import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class ChatServerThread extends Thread {
	

	private String nickname;
	private Socket socket;
	private List<Writer> listWriters;
	
	public ChatServerThread(Socket socket, List<Writer> listWriters) {
		this.socket = socket;
		this.listWriters = listWriters;
	}
	
	@Override
	public void run( ) {
		try {
		//1. Remote Host Information
		
		//2. Get Stream
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(
						socket.getInputStream(),
						StandardCharsets.UTF_8
						)
				);
		PrintWriter printWriter = new PrintWriter(
				new OutputStreamWriter(
						socket.getOutputStream(),
						StandardCharsets.UTF_8
						),
						true);
						
		//3. handling request
		while(true) {
			String request = bufferedReader.readLine();
			if(request == null) {
				System.out.println("클라이언트로부터 연결 끊김");
				doQuit(printWriter);
				break;
			}
			
			//4. analyze protocol
			String[] tokens = request.split(":");
			
			if("join".equals(tokens[0])) {
				doJoin(
					tokens[1],
					printWriter
					);
			} else if("message".equals(tokens[0])) {
				doMessage(tokens[1]);
	
			} else if("quit".equals(tokens[0])) {
				doQuit(printWriter);
				
			} else {
				System.out.println("에러: 알 수 없는 요청{" + tokens[0] + ")");
			}
		}
		} catch(IOException e) {
			e.printStackTrace();

		}
	}
	
	private void doQuit(Writer writer) {
		// TODO Auto-generated method stub
		removeWriter(writer);
		
		String data = nickname + "님이 퇴장하였습니다";
		broadcast(data);
	}

	private void doMessage(String message) {
		// TODO Auto-generated method stub
		String data = message;
		broadcast(message);
	}

	private void doJoin(String nickName, Writer writer) {
		this.nickname = nickName;
		
		String data = nickName + "님이 참여하였습니다";
		broadcast(data);
		
		/* writer pool에 저장 */
		addWriter(writer);
		
		// ack
		PrintWriter printWriter = (PrintWriter)writer;
		printWriter.println("join:ok");
		printWriter.flush();
	}
	
	private void addWriter(Writer writer) {
		synchronized(listWriters) {
			listWriters.add(writer);
		}
	}
	
	private void removeWriter(Writer writer) {
		synchronized(listWriters){
			listWriters.remove(writer);
		}
	}
	
	private void broadcast(String data) {
		synchronized(listWriters) {
			
			for(Writer writer : listWriters) {
				PrintWriter printWriter = (PrintWriter)writer;
				printWriter.println(data);
				printWriter.flush();
			}
		}
	}
}
