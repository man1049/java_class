package a211026;

public class four {

	public static void main(String[] args) {
		/*
		int i = 0;
		int sec = 0;
		int min = 0;
		int hour = 0;
		while(true) {
			if (hour == 23 && min == 59 && sec == 59) { System.out.println("하루가 지났읍니다."); break; }
			i++;
			try {
				Thread.sleep(1);	
			}catch(Exception e) {
			}
			sec = i % 60;
			if (sec < 10) {System.out.println(hour + " 시 "+ min + " 분 " + "0"+sec+" 초");}
			if (sec >= 10) {System.out.println(hour + " 시 " + min + " 분 " + sec+" 초");}
			if (sec == 59 && min < 59) {i = 0; min++;}
			if (hour < 23 && min == 59 && sec == 59) {i = 0; hour++; min = 0;}
			if (hour == 23 && min == 59 && sec == 59) { hour = 0; min = 0; sec = 0;}


		}
		 */

		/*

		double d = 10.75812;
		System.out.println((int)(d * 10 +0.5) / 10.0);

		 */

		/*

		int money = 87650;
		double res = ((double)money / 100 + 0.5) * 100;
		System.out.println((int)res);

		 */

		/*
		int year = 2024;

		boolean pan = ((year % 4) == 0 && year % 100 != 0 || year % 400 == 0);

		if (pan == true) {
			System.out.println("year는 윤년");
		}else {
			System.out.println("year는 윤년이 아님");
		}
		 */



	}

}
