package anonymousclass;

public class Main {

	public static void main(String[] args) {
		Template t = new TemplateImpl();
		t.method();
		
		//Template 인터페이스를 별도의 클래스를 만들지 않고 사용
		
		new Template() {
			@Override
			public void method() {
				System.out.println("익명 객체를 이용한 인터페이스 사용");
			}
		}.method();

	}

}
