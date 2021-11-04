package a211104;

public class WrapperMain {

	public static void main(String[] args) {
		//실수 32.4를 인스턴스로 생성
		Double d = 32.4;
		
		//Wrapper Type을 기본형으로 변경 
		double x = d;
		
		//문자열을 숫자로 변환
		//"123"을 숫자 123으로 변환
		int y = Integer.parseInt("123");
		
		// 중간에 공백이 있어서 NumberFormatException 발생
		try {
		y = Integer.parseInt("12 3");
		}catch(Exception e) {
			System.out.println(e);
		}
		
		String s = 123 + "";
		
		Integer i = 123;
		s = i.toString();
		
		//Object 클래스의 인스턴스에 기본형 데이터가 들어 있는 경우
		//기본형으로 형 변환은 안됩니다.
		//Wrapper Type으로 형변환해서 대입해야 합니다.
		Object o = 123;
		//int k = (int)o;는 하위버전에서 형 변환이 되지않고 Web에서는 하위버전을 쓰기때문에 (Integer)로 사용
		int k = (Integer)o;
		
		
		

	}

}
