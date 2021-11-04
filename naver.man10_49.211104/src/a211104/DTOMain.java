package a211104;

public class DTOMain {

	public static void main(String[] args) {
		
		DTO dto = new DTO();
		DTO dto2 = new DTO();

		dto.setNum(1);
		dto2.setNum(1);
		dto.setName("김백산");
		dto2.setName("김백산");
		
		System.out.println(dto.equals(dto2));
		
		int x = 100;
		int y = x;
		
		//복제
		DTO dto3 = dto.clone();
		DTO dto4 = dto.clone();
		System.out.println(dto);
		dto.setNum(88);
		dto3.setNum(6666);
		dto4.setNum(1034);
		
		// 복제하지않은 dto는 영향을 받지만
		// dto3 , dto4는 복제를 했기때문에 영향을 받지않음
		
		System.out.println(dto);
		System.out.println(dto3);
		System.out.println(dto4);
	}

}
