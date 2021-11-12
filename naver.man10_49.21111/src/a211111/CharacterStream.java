package a211111;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CharacterStream {

	public static void main(String[] args) {
		//문자 단위로 기록 - 버퍼를 사용 : PrintWriter
		//파일의 경로를 설정 - 현재 디렉토리에
		
		PrintWriter ps = null;
		
		try {
			ps = new PrintWriter("D:\\eclipse-workspace\\naver.man10_49.21111\\태백산.gg");
			String str = "마음대로 만들기";
			ps.write(str);
			//내용이 많을 때는 마지막 내용이 기록이 안될수도 있으므로 버퍼를 비워줌
			ps.flush();
		} catch (FileNotFoundException e) {
			try {
				ps = new PrintWriter("D:\\eclipse-workspace\\naver.man10_49.21111\\error_log.gg");
				Date dt = new Date();
				SimpleDateFormat dsf = new SimpleDateFormat("yyyy-MM-ddd hh:mm:ss");
				String log_add = dsf.format(dt);
				ps.write(log_add);
				ps.flush();
				System.out.println("파일경로오류 로그를 확인");
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}finally {
				ps.close();
			}
			
		}finally {
			ps.close();
		}
		
		//줄 단위로 텍스트를 읽기
		//텍스트를 읽을 때 확인 사항 - BufferedReader
		//1.경로 확인 - 현재 디렉토리에 character.txt
		//2.한글 포함 여부 확인 - 인코딩을 확인(읽은 후 글자가 꺠지면 인코딩을 수정)
		//3.파일의 크기가 크면 한 번에 읽지 못하거나 시간이 오래 걸리거나 컴퓨터가 버벅임
		
		BufferedReader br = null;
		
		try {
			//현재 디렉토리에 있는 소백산.gg 파일을 가지고 생성
			br = new BufferedReader
					(new InputStreamReader
							(new FileInputStream("./김백산.txt")));
			
			//줄 단위로 읽어서 출력
			/*
			while(true) {
				String res = br.readLine();
				if(res == null) {
					break;
				}
				System.out.println(res);
			}
			
			*/
			
			//줄 단위로 읽어서 바로 출력하지 않고 변수에 저장
			String data = "";
			StringBuilder sb = new StringBuilder();
			
			while(true) {
				
				String res = br.readLine();
				sb.append(res);
				sb.append("\n");
				if(res == null) {
					break;
				}
				data = sb.toString();
			}
			
			System.out.println(data);
		} catch (Exception e) {
			System.out.println("오류");
		} finally {
			try {
				br.close();
			} catch (IOException e) {}
		}
	}
}
