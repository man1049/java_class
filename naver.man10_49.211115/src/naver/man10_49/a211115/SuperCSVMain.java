package naver.man10_49.a211115;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.supercsv.cellprocessor.*;
import org.supercsv.cellprocessor.constraint.NotNull;
import org.supercsv.cellprocessor.ift.CellProcessor;
import org.supercsv.io.CsvBeanReader;
import org.supercsv.io.ICsvBeanReader;
import org.supercsv.prefs.CsvPreference;

public class SuperCSVMain {

	public static void main(String[] args) {
		//제약조건(반드시 지켜야 할 조건)을 설정
		//NotNull 은 필수
		//ParseInt는 정수로 변경
		//ParseDate는 날짜로 변경하는데 형식을 설정
		//Optional 은 있어도 되고 없어도 됩니다.
		CellProcessor [] processors = new CellProcessor[] {
				new NotNull(),
				new ParseInt(new NotNull()),
				new ParseDate("yyyy-MM-dd"),
				new Optional(),
				new Optional()
		};
		
		//전체 데이터를 저장 할 List 생성
		List<Player> list = new ArrayList<>();
		
		//파일 경로를 생성
		Path path = Paths.get("./volleyball.csv");
		
		//읽기
		//try()를 사용하면 () 안에서 만든 인스턴스는 AutoCloseable 인터페이스를
		//구현했다면 close를 호출하지 않아도 됩니다.
		try(
				//CSV 파일을 읽을 수 있는 인스턴스를 생성
				ICsvBeanReader beanReader = 
				new CsvBeanReader(Files.newBufferedReader(path), 
						CsvPreference.STANDARD_PREFERENCE)){
			
			//첫번째 행이 필드의 이름인 경우 행의 이름을 가져오기
			String[] header = beanReader.getHeader(true);
			//첫번째 행이 필드의 이름이 아닌 경우 직접 배열로 생성
			String[] userDefineHeader = {
					"name", "age" , "birth", "email", "nickname"
			};
			//데이터 읽기
			while(true) {
				//하나의 행을 읽어서 player.class로 변환
				//header 이름과 player의 속성이름을 매핑시켜서 생성
				//processors 제약조건을 적용
				Player player = beanReader.read(Player.class, userDefineHeader, processors);
				//읽은 데이터가 없으면 반복문 종료
				if(player == null) {
					break;
				}
				//읽은 데이터는 list에 추가
				list.add(player);
				
				
			}
			//출력하기
			for(Player player : list) {
				System.out.println(player);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getLocalizedMessage());
		}
		
	}

}
