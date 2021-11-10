package a211110;

public class ThreadCreate {

	public static void main(String[] args) {
		//Thread를 상속받은 ThreadEx 클래스를 가지고 스레드를 생성하고 시작
		ThreadEx threadex = new ThreadEx();

		threadex.start();
		threadex = new ThreadEx();
		threadex.start();

		//Runnable 인터페이스를 구현한 RunnableImpl 클래스를 가지고 스레드를
		//생성하고 시작
		RunnableImpl rb = new RunnableImpl();
		Thread th = new Thread(rb);
		th.start();
		th = new Thread(rb);
		th.start();
		//new Thread(new RunnableImpl()).start()와 동일
		//하지만 stack을 더 사용하기 떄문에 사용을 하지않는걸 권장함


		Runnable rb2 = new Runnable() {

			@Override
			public void run() {
				for(int i = 20 ; i < 31 ; i = i + 1) {
					try {
						Thread.sleep(10);
						System.out.println("쓰레드"+i);

					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		Thread th2 = new Thread(rb2);
		th2.start();

		Thread th3 = new Thread() {
			public void run() {
				for(int i = 30 ; i < 41 ; i = i + 1) {
					try {
						Thread.sleep(10);
						System.out.println("쓰레드"+i);

					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		th3.start();
	}

}
class RunnableImpl implements Runnable{

	@Override
	public void run() {
		for(int i = 10 ; i < 21 ; i = i + 1) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("쓰레드"+i);
		}
	}

}

class ThreadEx extends Thread{
	public void run() {
		for(int i = 0 ; i < 10 ; i = i + 1) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("쓰레드"+i);
		}
	}
}