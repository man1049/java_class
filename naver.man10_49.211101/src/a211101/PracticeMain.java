package a211101;

public class PracticeMain {

	public static void main(String[] args) {
		//1.Practice 클래스의 staticMethod 호출
		Practice.staticMethod();
		//2.Practice 클래스의 disp 호출
		Practice pr = new Practice();
		pr.disp();
		//3.Practice 클래스의 sum 메서드를 이용해서 1부터 100까지의 합계 출력
		Practice pr1 = new Practice();
		pr1.sum(100);
		//4.Practice 클래스의 prime 메소드를 호출해서 2부터 1000까지의 소수 개수 출력
		Practice pr2 = new Practice();
		System.out.println(pr2.prime());
	}

}
