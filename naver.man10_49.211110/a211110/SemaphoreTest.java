package a211110;

import java.util.concurrent.Semaphore;

class StThread extends Thread{
	Semaphore semaphore;
	public StThread(Semaphore semaphore) {
		this.semaphore = semaphore;
	}

	public void run() {
		try {
			//열쇠를 취득
			semaphore.acquire();
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(getName());
		//열쇠를 반납
		semaphore.release();
	}
}

public class SemaphoreTest {

	public static void main(String[] args) {
		Semaphore sp = new Semaphore(3);
		StThread st = new StThread(sp); st.start();
		st = new StThread(sp); st.start();
		st = new StThread(sp); st.start();
		st = new StThread(sp); st.start();
		st = new StThread(sp); st.start();
		st = new StThread(sp); st.start();
		st = new StThread(sp); st.start();
		st = new StThread(sp); st.start();
		

	}

}
