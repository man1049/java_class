package a211112;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPAddress {

	public static void main(String[] args) {
		//자신의 컴퓨터 IP 정보
		try {
			InetAddress localhost = InetAddress.getLocalHost();
			System.out.println(localhost);
			
			//naver의 IP 정보
			InetAddress[] naver = InetAddress.getAllByName("www.naver.com");
			for(InetAddress n : naver) {
				System.out.println(n.getCanonicalHostName());
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			
		}


	}

}
