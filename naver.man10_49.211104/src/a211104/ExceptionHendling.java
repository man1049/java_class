package a211104;

public class ExceptionHendling {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		
		try {
			a = 99999;
			System.out.println(a/b);
		}catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		System.out.println("예외처리 후 출력");

	}

}
