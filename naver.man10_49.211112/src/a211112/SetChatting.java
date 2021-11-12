package a211112;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.Scanner;

public class SetChatting {

	public static void main(String[] args) {
		//UDP 전송에 사용 할 데이터
		DatagramPacket packet = null;

		//Multicast 전송에 사용 할 소켓
		MulticastSocket socket = null;
		try {
			//보내는 MulticastSocket 생성
			socket = new MulticastSocket();
			
			//입력받기 위한 Scanner 생성
			Scanner sc = new Scanner(System.in);
			
			//대화명 입력받기
			System.out.println("대화명 입력 : ");
			String nick = sc.nextLine();
			
			//접속 할 주소 생성
			InetAddress address = InetAddress.getByName("224.128.1.5");
			while(true) {
				System.out.println("전송 할 메세지 : ");
				String msg = sc.nextLine();
				if(msg.equals("종료")) {
					msg = nick + "님이 퇴장하셨습니다.";
					packet = new DatagramPacket(msg.getBytes(), msg.getBytes().length, address, 10000);
					socket.send(packet);
					break;
				}else {
					msg = nick + " : " + msg;
					packet = new DatagramPacket(msg.getBytes(), msg.getBytes().length, address, 10000);
					socket.send(packet);
				}
			}
		}
		catch(Exception e) {

		}finally {
			socket.close();
		}
	}
}
