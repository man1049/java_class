package a211110;

//스레드 클래스 
class ShareData implements Runnable{
	private int result;
	private int idx;

	public int getResult() {
		return result;
	}

	//메서드의 결과형 앞에 synchronized를 붙이면 동기화 메서드가 됩니다.
	private void sum() {
		//idx를 1000번 증가시켜서 result에 더해주기
		for(int i=0; i<1000; i=i+1) {
			synchronized(this) {
				idx = idx + 1;
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}			
				result = result + idx;
			}
		}
	}

	//스레드로 동작할 메서드
	public void run() {
		sum();
	}
}


public class Mutex {

	public static void main(String[] args) {
		//ShareData 인스턴스 생성
		ShareData sh = new ShareData();
		//위의 인스턴스를 가지고 스레드를 생성 - 공유 데이터를 가지고 스레드를 생성
		Thread th1 = new Thread(sh);
		Thread th2 = new Thread(sh);

		//스레드 실행
		th1.start();
		th2.start();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		//sh 의 result 값을 출력
		System.out.println(sh.getResult());

	}
}






