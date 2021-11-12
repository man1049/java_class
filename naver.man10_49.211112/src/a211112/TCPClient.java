package a211112;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {

	public static void main(String[] args) {
		Socket socket = null;
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("메세지 입력 : ");
			String msg = sc.nextLine() ;
			
			//상대 컴퓨터의 IP 주소
			InetAddress address = InetAddress.getByName("192.168.10.20");
			//InetAddress address = InetAddress.getByName("192.168.10.32");
			
			//소켓 생성
			socket = new Socket(address, 9000);
			//소켓을 이용해서 전송 할 스트림 생성
			PrintWriter pw = new PrintWriter(socket.getOutputStream());
			
			//문자열 전송
			pw.println(msg);
			pw.flush();
			
			//스캐너 종료
			sc.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			try {
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
