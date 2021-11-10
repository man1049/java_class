package a211110;

public class ThreadPriority {

	public static void main(String[] args) {
		Thread th = new Thread() {
			public void run() {
				for(int i = 0 ; i < 10 ; i = i + 1) {
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				System.out.println("쓰레드1");
				}
			}
		};
		th.setPriority(Thread.MIN_PRIORITY);
		th.start();
		
		Thread th2 = new Thread() {
			public void run() {
				for(int i = 0 ; i < 10 ; i = i + 1) {
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				System.out.println("쓰레드2");
				}
			}
		};
		th2.setPriority(Thread.MAX_PRIORITY);
		th2.start();

	}

}
