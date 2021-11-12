package a211112;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) {
		//서버 소켓과 클라이언트와 통신에 사용 할 소켓을 생성
		ServerSocket ss = null;
		Socket socket =null;
		
		try {
			ss = new ServerSocket(9000);
			System.out.println("서버 대기중");
			while(true) {
				//클라이언트 요청을 대기
				socket = ss.accept();
				//접속한 클라이언트 정보 확인
				System.out.println("클라이언트 정보 : "+socket.toString());
				
				//클라이언트가 전송한 문자열 읽기
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String msg = br.readLine();
				System.out.println("보내온 메세지 : "+msg);
				
				br.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}

	}

}
