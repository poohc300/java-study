package echo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class EchoServer {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		
		try {
			//1. 서버소켓 생성
			serverSocket = new ServerSocket();
			
			//2. 바인딩(binding)
			//	 Socket에 InetSocketAddress(IP Address + Port)를 바인딩한다.
			//	 IPAddress(0.0.0.0) : 특정 호스트 IP를 바인딩 하지 않는다.
			//	 backlog:  요청 queue(10)
			serverSocket.bind(new InetSocketAddress("0.0.0.0", 5555), 10);
			
			//3. accept
			//	 클라이언트로 부터 요청을 기다린다.
			Socket socket = serverSocket.accept(); // blocking
			
			InetSocketAddress inetSocketAddress = (InetSocketAddress)socket.getRemoteSocketAddress();
			String remoteHostAddress = inetSocketAddress.getAddress().getHostAddress();
			int remoteHostPort = inetSocketAddress.getPort();
			System.out.println("[server] connected by client[" + remoteHostAddress + ":" + remoteHostPort + "]");
			
			//4. IO Stream 받아오기
			try {
				InputStream is = socket.getInputStream();
				OutputStream os = socket.getOutputStream();
				
				// Byte Buffer
				
				byte[] buffer = new byte[256];
				while(true) {
					//5. 데이터 읽기
					// 클라이언트가 연결되어 있는 동안 무한루프로 받아오려면
					// while(true)
					int readByteCount = is.read(buffer);
					
					if(readByteCount == -1) {
						//클라이언트에서 닫아버렸다면 == 파일의 끝
						//클라이언트가 정상적으로 종료
						//close() 호출
						System.out.println("[server] closed by client");
						break;
					}
					
					
					
					String data = new String(buffer, 0, readByteCount, "UTF-8");
					System.out.println("[server] received:" + data);
					
					//6. 데이터 쓰기
					os.write(data.getBytes("UTF-8"));
					
				}
			} catch(SocketException ex) {
				System.out.println("[server] suddenly closed by client");
			} catch(IOException ex) {
				System.out.println("[server] error:" +ex);
			} finally {
				// 소켓만 닫으면 안에 있는건 자동으로 닫힘
				try {
					if(socket != null && !socket.isClosed()) {
						socket.close();
					}
					
				} catch(IOException ex) {
					ex.printStackTrace();
				}
			}
		} catch (IOException e) {
			System.out.println("[server] error:" + e);
		} finally {
			try {
				if(serverSocket != null && !serverSocket.isClosed()) {
					serverSocket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}