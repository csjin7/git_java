package chap18_1;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {
	

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("localhost",5001));
			while(true) {
				System.out.println("연결 기다림");
				Socket socket = serverSocket.accept();
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println("연결 수락함 " + isa.getHostName());
			}
		} catch (Exception e) {	}
		
		if(!serverSocket.isClosed()) {
			try {
				System.out.println("서버 소켓 종료");
				serverSocket.close();
			} catch (Exception e) {}
		}

	}

}
