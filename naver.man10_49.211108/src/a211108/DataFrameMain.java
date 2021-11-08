package a211108;
import java.util.ArrayList;

public class DataFrameMain {

	public static void main(String[] args) {
		//1.DataFrame 만들기
		// - 가로의 각 항목
		
		//DTO Class - 가로
		
		//배열, ArrayList, LinkedList - 세로
		
		ArrayList<DTO> ar = new ArrayList<>();
		
		//2. 데이터 추가
		DTO dto = new DTO();
		dto.setName("김백산");
		dto.setNumber(1);
		dto.setPrice(79000);
		
		//마지막에 데이터 추가
		ar.add(dto);
		
		//새로운 데이터를 만들어서 dto 에 대입
		dto = new DTO();
		dto.setName("소백산");
		dto.setNumber(2);
		dto.setPrice(7000);
		
		ar.add(dto);
		
		dto = new DTO();
		dto.setName("태백산");
		dto.setNumber(3);
		dto.setPrice(42000);
		
		ar.add(dto);
		
		dto = new DTO();
		dto.setName("장백산");
		dto.setNumber(4);
		dto.setPrice(42000);
		
		ar.add(2,dto);
		
		System.out.println(ar);
	}

}
