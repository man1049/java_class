
package a211102;

public class Sub extends Super {
	public void subMethod() {
		//private는 하위클래스에서 접근 X
		//privateMethod();
		
		//package는 동일한 패키지면 접근 O
		packageMethod();
		
		// protected는 하위클래스에서 접근 O
		protectedMethod();
		
		//public은 하위클래스에서 접근 O
		publicMethod();
		
	}
}
