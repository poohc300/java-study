package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {
	private static final String SERVER_IP = "127.0.0.1";
	private static final int SERVER_PORT = 6666;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = null;
		Socket socket = null;
		
		try {
			//1. 키보드 연결
			scanner = new Scanner(System.in);
			//2. 소켓 생성
			socket = new Socket();

			//3. 연결
			socket.connect(new InetSocketAddress(SERVER_IP, SERVER_PORT));

			//4. reader/writer 생성
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"), true);

			//5. join 프로토콜
			System.out.print("닉네임>>");
			String nickname = scanner.nextLine();
			
			pw.println("join: "+ nickname);
			pw.flush();
			//6. ChatClientThread 시작
			ChatClientThread cct = new ChatClientThread();

			//7. 키보드 입력처리
			while(true) {
				System.out.println(">>");
				String input = scanner.nextLine();
				
				if("quit".equals(input) == true) {
					//8. quit 프로토콜 처리
					socket.close();
					break;
				} else {
					//9. 메시지 처리
					pw.println(input);
					
				}
			}
		} catch(IOException ex) {
			System.out.println("Error: "+ex);
		} finally {
			//10. 자원 정리
			try {
				if(scanner != null) {
					scanner.close();
				}
				if(socket != null && !socket.isClosed()) {
					socket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
