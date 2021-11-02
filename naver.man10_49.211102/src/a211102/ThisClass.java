package a211102;

public class ThisClass {
	private int num;
	
	public void method()	{
		int num = 100;
		System.out.println(num);
		System.out.println(this.num);
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "ThisCalss [num=" + num + "]";
	}
	
	static {
		System.out.println("첫 김백산");
	}
	{
		System.out.println("계속 불러와지는 김백산");
	}
	
	
}
