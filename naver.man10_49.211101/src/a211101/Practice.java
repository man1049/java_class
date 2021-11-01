package a211101;

public class Practice {
	//static 메서드
	public static void staticMethod() {
		System.out.println("static 메서드");
	}
	
	//member 메서드
	public void disp() {
		System.out.println("매개변수가 없고 리턴타입도 없는 member 메소드");
	}
	
	//매개변수가 있는 메서드
	public void sum(int n) {
		int tot = 0;
		for(int i=1; i<n+1; i=i+1) {
			tot = tot + i;
		}
		System.out.println("1부터 n까지의 합:" + tot);
	}
	
	//2부터 1000까지의 소수의 개수
	public int prime() {
		int cnt = 0;
		for(int i=2; i<=1000; i=i+1) {
			boolean flag = true;
			for(int j=2; j< i/2 + 1; j=j+1) {
				if(i % j == 0) {
					flag = false;
					break;
				}
			}
			if(flag == true) {
				cnt = cnt + 1;
			}
		}
		return cnt;
	}
}





