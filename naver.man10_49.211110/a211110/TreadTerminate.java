package a211110;

public class TreadTerminate {

	public static void main(String[] args) {
		//스레드 강제종료하기
		
		Thread th = new Thread() {
			public void run() {
				for(int i= 1 ; i < 11 ; i = i + 1) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					System.out.println("강제로 스레드 종료");
					return;
				}
					System.out.println(i);
			}
			}
		};
		th.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		th.interrupt();
		
		

	}

}
