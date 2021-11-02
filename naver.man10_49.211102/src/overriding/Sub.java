package overriding;

public class Sub extends Super {
	public void count() {
		super.count();
		System.out.println("하위 클래스입니다.");
	}
}
