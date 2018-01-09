package chap18_1;

import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientEx {

	public static void main(String[] args) {
		Socket socket = null;
		
		try {
			socket = new Socket();
			System.out.println("연결 요청");
			socket.connect(new InetSocketAddress("localhost", 5001));
			System.out.println("연결 성공");
			
		} catch (Exception e) {}
		
		if(!socket.isClosed()) {
			try {
				System.out.println("클라이언드 소켓 종료");
				socket.close();
			} catch (Exception e) {}
		}

	}

}
