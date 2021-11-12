package a211111;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ByteFileProcessing {

	public static void main(String[] args) {
		/*
		FileOutputStream fos = null ;
		//출력할 파일 스트림 생성
		//현재 작업 디렉토리에 bytefile.txt로 설정
		try {
			fos = new FileOutputStream("./mytext.txt",true);
			//기록할만한 문자열을 생성
			String str = "오늘은 21년 11월 11일입니다.";
			fos.write(str.getBytes());

			
		} catch (Exception e) {
			System.out.println("파일이 없습니다.");
		}finally {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		//FileOutputStream fos = null ;
		FileInputStream fis = null;
		//Scanner sc = new Scanner(System.in);
		//System.out.print("복사된 텍스트파일 이름을 정하시오 : ");
		//String st = sc.nextLine();
		try {
			//파일을 바이트 단위로 읽기 위한 스트림을 생성
			fis = new FileInputStream("./mytext.txt");
			//fos = new FileOutputStream("./"+st+".txt");
			//읽어서 저장 할 수 있는 배열을 생성
			
			//한번에 읽고자 하는 경우
			byte[] b = new byte[fis.available()];
			int len = fis.read(b);
			if(len <= 0) {
				System.out.println("읽은 데이터가 없음");
			}else {
				//바이트 배열을 문자열로 변환하기
				String str = new String(b);
				System.out.println(str);
				//fos.write(str.getBytes());
			}
 		} catch (Exception e) {
			System.out.println("파일 경로를 확인하세요.");
		}finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		*/
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("./mytext.txt");
			//전체를 한번에 읽지 않고 나누어서 읽기
			//한글의 경우는 나누어서 읽으면 꺠질 수 있음
			//영문과 한글은 바이트 수가 다르기 떄문
			//바이트 스트림은 텍스트를 나누어서 읽으면 안됨
			
			while(true) {
			
			
			//실제 버퍼의 크기는 대부분 8의 배수로 만들고 큰 숫자 사용
			byte[] b = new byte[12];
			//b에 b의 크기만큼 읽어서 저장하고 읽은 개수를 리턴
			//읽은 데이터가 없으면 0또는 음수 리턴
			int len = fis.read(b);
			if(len <= 0) {
				break;
			}
			String str =new String(b,0,len);
			System.out.println(str);
			}
		} catch (Exception e) {
			System.out.println("파일 경로를 확인하세요.");
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
