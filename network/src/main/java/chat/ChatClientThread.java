package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ChatClientThread extends Thread {

	private BufferedReader bufferedReader;
	private Socket clientSocket;
	
	@Override
	public void run() {
		/* reader를 통해 읽은 데이터 콘솔에 출력하기 (message 처리) */
		super.run();
		try {
			bufferedReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			String receivedMessage;
			
			while(true) {
				receivedMessage = bufferedReader.readLine();
				System.out.println("Message: "+receivedMessage);
			}
		} catch(IOException e) {
			System.out.println("Error: "+e);

		}
	
	}
	
	public void setSocket(Socket socket) {
		clientSocket = socket;
	}
}
