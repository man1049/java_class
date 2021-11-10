package a211110;

public class DadmonThread {

	public static void main(String[] args) {
		Thread th = new Thread() {
			public void run() {
				while(true) {
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("자동저장");
				}
			}
		};
		th.setDaemon(true);
		th.setName("자동저장");
		th.start();
		
		//데몬스레드는 다음 스레드가 종료가 될 시 종료됨
		Thread th2 = new Thread() {
			public void run() {
				try {
					Thread.sleep(20000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(th.getName()+"종료");
			}
		};
		th2.start();
	}

}
