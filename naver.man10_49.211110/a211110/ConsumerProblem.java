package a211110;

import java.util.ArrayList;
import java.util.List;

//공유 자원 클래스 - 진열대
class Product{
	List<Character> list;
	
	//생성자
	public Product() {
		list = new ArrayList<Character>();
	}
	
	//물건을 생산하는 메서드
	public synchronized void put(char ch) {
		list.add(ch);
		//물건을 생성한 후 알림을 줍니다.
		notifyAll();
		
		System.out.println(ch + "가 입고되었습니다.");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("현재 재고 수량:" + list.size());
	}
	
	//물건을 소비하는 메서드
	public synchronized char get() {
		//물건을 소비하기 전에 창고에 물건이 없으면 대기
		if(list.size() == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		char ch = list.remove(0);
		System.out.println(ch + "가 출고 되었습니다.");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("현재 재고 수량:" + list.size());
		return ch;
	}
}

//생산자 스레드 - Thread 클래스로부터 상속
class Producer extends Thread{
	//창고
	private Product list;
	//생성자 - 외부에서 데이터를 받아서 자신의 멤버 변수에 대입
	//DI(Dependency Injection) - 의존성 주입
	public Producer(Product list) {
		this.list = list;
	}
	
	public void run() {
		//26번 A ~ Z 까지를 list에 추가
		for(int i = 65; i<=90; i=i+1) {
			list.put((char)i);
		}
	}
}

//소비자 스레드
class Customer extends Thread{
	private Product list;
	
	public Customer(Product list) {
		this.list = list;
	}
	
	public void run() {
		//26번 list에서 꺼내오기
		for(int i=0; i<26; i=i+1) {
			list.get();
		}
	}
}


public class ConsumerProblem {

	public static void main(String[] args) {
		//공유할 진열대 생성
		Product product = new Product();
		
		//생산자 와 소비자 스레드 생성 및 실행
		Producer p = new Producer(product);
		Customer c = new Customer(product);
		
		p.start();
		c.start();

	}

}
