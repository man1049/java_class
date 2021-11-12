package a211111;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

public class BufferedStream {

	public static void main(String[] args) {
		
		// 파일에 바이트 단위로 버퍼를 이용해서 기록 - PrintStream
		PrintStream ps = null;
		
		try {
			//상대 경로를 이용해서 기록 할 파일 스트림을 생성
			//상대 경로에는 \가 없음
			//현재 작업 디렉토리에 김백산.g 파일을 생성해서 기록
			ps = new PrintStream("./김백산.g");
			String str = "김백산 확장자 g 파일";
			//기록 - 문자열을 기록하는 메서드가 존재
			ps.print(str);
		}catch(Exception e) {
		
		}finally {
			//스트림 닫기
			ps.close();
		}
		
		//파일에서 바이트 단위로 버퍼를 사용해서 읽기 - BufferedInputStream
		BufferedInputStream bis = null;
		try {
			//절대경로를 이용해서 생성하기
			//MS-Windows는 드라이브 이름부터 시작하고 디렉토리 구분기호는 \
			//다른 시스템은 / 부터 시작하고 디렉토리 구분기호는 /
			//컴퓨터마다 다르게 지정
			FileInputStream fis = new FileInputStream("D:\\eclipse-workspace\\naver.man10_49.21111\\김백산.g");
			bis = new BufferedInputStream(fis);
			//한번에 읽기
			byte[] b = new byte[bis.available()];
			//읽어서 저장하기
			//read에 매개변수가 있으면 읽은 개수를 리턴
			int lng = bis.read(b);
			
			//읽어낸 바이트 배열을 문자열로 만들기
			String res = new String(b,0,lng);
			
			//읽은 내용을 출력
			System.out.println(res);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
		} finally {
			try {
				bis.close();
			} catch (IOException e) {
				
			}
		}
		
		
		

	}

}
