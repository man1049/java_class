package a211104;

import java.util.Random;

public class java_lang {

	public static void main(String[] args) {
		//Random 메서드를 이용해서
		//0.0 ~ 1.0 사이의 랜덤한 실수를 만들어 출력하기
		
		/*Random rand = new Random();
		double ran = rand.nextDouble();
		while(true) {
			System.out.println((double)((int)(ran*1000))/1000);
			ran = rand.nextDouble();
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			
		}
		}*/
		
		//모든 멤버가 static 이라서 생성자를 외부에 노출시키지 않음
		//java.lang.Math m = new java.lang.Math();
		
		//추상 클래스라서 인스턴스 생성 못함
		//java.lang.Calendar cal = new java.lang.();
		
		//인터페이스라서 인스턴스 생성 못함
		//java.util.List list = new java.util.List();
		
		//java.lang.Thread 클래스의 sleep 이라는 메서드를 이용하면
		//일정 시간 동안 현재 스레드를 대기 시킬 수 있습니다.
		/*System.out.println("3초 시작");
		try {
		Thread.sleep(1000);
		System.out.println("1");
		Thread.sleep(1000);
		System.out.println("2");
		Thread.sleep(1000);
		System.out.println("3");
		}catch(Exception e) {
			
		}
		System.out.println("종료");
		*/
		
		//Runtime a = Runtime.getRuntime();
		
	}

}
