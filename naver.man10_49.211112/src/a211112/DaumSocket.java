package a211112;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class DaumSocket {

	public static void main(String[] args) {
		
		Socket sc = null;
		InetAddress ia = null;
		
		//문자 단위로 쓰고 읽기 위한 변수
		PrintWriter out = null;
		BufferedReader in = null;
		
		try {
			//통신하고자 하는 곳의 주소를 생성
			ia = InetAddress.getByName("www.daum.net");
			//통신을 위한 소켓을 생성
			sc = new Socket(ia, 80);
			
			//읽고 쓰기 위한 스트림을 생성
			in = new BufferedReader(new InputStreamReader(sc.getInputStream()));
			out = new PrintWriter(sc.getOutputStream());
			
			//메세지 보내기
			out.println("GET http://www.daum.net");
			out.flush();
			
			//보내준 메세지 읽기
			while(true) {
				String line = in.readLine();
				if(line == null) {
					break;
				}
				System.out.println(line);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				in.close();
				out.close();
				sc.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}
