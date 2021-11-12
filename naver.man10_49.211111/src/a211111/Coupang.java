package a211111;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
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
			Map<String,Integer> ip_trp = new HashMap<>();
			while(true) {
				String str = br.readLine();

				if(str == null) {
					break;
				}



				//데이터 라인 수
				String[] sp = str.split(" ");
				jungbok.add(sp[0]);

				//아이피별 총 트래픽 계산
				//sp[9]가 숫자로된 문자열이 아닐경우 Exception이 발생하기 때문에
				//try~catch로 예외
				try {
					//Map은 같은 key에 값을 넣을 시 덮어씌워지기 떄문에
					//key값이 없을경우 sp[0](IP)에 sp[9](트래픽)을 정수로 변환해서 넣어줌
					if(ip_trp.get(sp[0]) == null) {
						ip_trp.put(sp[0], Integer.parseInt(sp[9]));
					}else
						//sp[0]이 null이 아닐경우
						if(ip_trp.get(sp[0]) != null) {
						//sp[0]에 sp[0]값을 불러온 후 해당 값에 sp[9]를 정수로 변환해서 더해줌
						ip_trp.put(sp[0], ip_trp.get(sp[0])+Integer.parseInt(sp[9]));
					}
				}catch (Exception e){}
				////////////////////////
				line_count += 1;

				try {
					trf = trf + Integer.parseInt(sp[9]);
				}catch (Exception e) {

				}
				/*
				sb.append(line_count);
				sb.append(".\t IP : ");
				sb.append(sp[0]);
				sb.append("\t traffic : ");
				sb.append(sp[9]);
				sb.append("\n");
				 */
			}

			//각 ip의 총 합을 더할 변수
			int jungbok_it_tr_count = 0;
			
			//TreeSet으로 저장 된 중복되지않은 IP들을 저장하기 위한 문자열의배열 변수
			String[] jungbok_it;	
			
			//i를 jungkok의 길이까지 반복합니다.
			for(int i = 0 ; i < jungbok.size() ; i = i + 1) {
				
				// jungbok에 Set으로 입력 된 IP 데이터를 배열로 변경 후 jungbok_it에 옮깁니다.
				jungbok_it = jungbok.toArray(new String[i]);
				
				//Map에 jungbok_it[i]에 담겨진 ip 문자열을 이용하여 key에 대입했을 때 null이 아닐 경우 출력
				if(ip_trp.get(jungbok_it[i]) != null) {
					
					//ip_trp(HashMap)에 저장 된 값을 불러오기 위해 jungbok_it[i]에 저장 된 ip들을
					//key값으로 사용해 불러오고 jungbok_it_tr_count에 더해줍니다.
					jungbok_it_tr_count = jungbok_it_tr_count+ip_trp.get(jungbok_it[i]);
					
					//ip와 해당 아이피의 총 트래픽 출력
					System.out.println(jungbok_it[i]+" : "+ip_trp.get(jungbok_it[i]));
				}
			}


			System.out.println("총 트래픽 : " + trf);
			System.out.println("계산된 총 트래픽 : " + jungbok_it_tr_count);
			/*
			System.out.println("중복을 제외한 IP 개수 : "+jungbok.size());
			System.out.println("중복 된 IP 개수 : "+(line_count - jungbok.size()));

			data = sb.toString();

			System.out.println(data);
			 */

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//IP별 총 트래픽 출력

	}
}

