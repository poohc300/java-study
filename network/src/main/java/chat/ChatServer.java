package chat;

import java.io.IOException;
import java.io.Writer;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ChatServer {
	private static final int PORT = 6666;

	public static void main(String[] args) {
		
		try {
			//1. 서버 소켓 생성
			ServerSocket serverSocket = new ServerSocket();
			//2. 바인딩
			String hostAddress = InetAddress.getLocalHost().getHostAddress();
			serverSocket.bind(new InetSocketAddress(hostAddress, PORT));
			System.out.println("연결 기다림 "+ hostAddress + ":" + PORT);
			//3. 요청 대기
			while(true) {
				Socket socket = serverSocket.accept();
				List<Writer> listWriters = new ArrayList<Writer>();
				
				new ChatServerThread(socket, listWriters).start();
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
