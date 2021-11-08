package a211108;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class DTOandMap {

	public static void main(String[] args) {
		
		//DTO를 이용해서 데이터를 생성
		DTO dto = new DTO();
		dto.setName("김백산");
		dto.setPrice(94000);
		
		//데이터 출력 - DTO는 반복문을 사용 할 수 없음
		
		System.out.println(dto.getName());
		System.out.println(dto.getPrice());

		LinkedHashMap<String,Object> lhm = new LinkedHashMap<>();
		
		lhm.put("이름", "김백산");
		lhm.put("나이", 29);
		
		Set<String> keys =lhm.keySet();
		for(String key : keys) {
			System.out.println(key);
		}
		
		
		
	}

}
