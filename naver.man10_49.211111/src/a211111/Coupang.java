package a211111;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Coupang {

	public static void main(String[] args) {
		
		//웹 로그 분석
		
		BufferedReader br = null;
		
		try {
			
			//br log.txt 파일을 연결해서 인스턴스를 생성하고 대입
			//파일을 현재 작업 디렉토리에 복사해서 수행
			br = new BufferedReader(new InputStreamReader(new FileInputStream("./log.txt")));
			//파일의 내용을 전부 읽어서 출력
			String data = "";
			StringBuilder sb = new StringBuilder();
			int line_count = 0;
			int trf = 0;
			Set<String> jungbok = new HashSet<>();
			while(true) {
				String str = br.readLine();
				
				if(str == null) {
					break;
				}
				
				//데이터 라인 수
				String[] sp = str.split(" ");
				jungbok.add(sp[0]);
				line_count += 1;
				
				try {
				trf = trf + Integer.parseInt(sp[9]);
				}catch (Exception e) {
					
				}
				
				sb.append(line_count);
				sb.append(".\t IP : ");
				sb.append(sp[0]);
				sb.append("\t traffic : ");
				sb.append(sp[9]);
				sb.append("\n");
			}
			data = sb.toString();
			System.out.println(data);
			System.out.println("중복을 제외한 IP 개수 : "+jungbok.size());
			System.out.println("중복 된 IP 개수 : "+(line_count - jungbok.size()));
			System.out.println("총 트래픽 : " + trf);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
