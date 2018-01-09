package chap18_1;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {

	public static void main(String[] args) {
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println(local.getHostName());
			
			InetAddress[] iaArr = InetAddress.getAllByName("www.korea.com");
			for (InetAddress remote : iaArr) {
				System.out.println("입력한 주소의 IP주소들 : " + remote.getHostAddress());
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
