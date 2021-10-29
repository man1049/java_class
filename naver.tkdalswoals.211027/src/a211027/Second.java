package a211027;

public class Second {

	public static void main(String[] args) {


		// if 문
		/*
		int su = 79;
		if (su%2 == 0) {System.out.println(su+"은(는) 짝수입니다.");}
		else {System.out.println(su+"은(는) 홀수입니다.");}

		int year = 2024;
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ) 
		{System.out.println(year+"년은(는) 윤년입니다.");}
		else {System.out.println(year+"년은(는) 윤년이 아닙니다.");}
		 */
		/*
		int score = 100;

		if (score >= 90) {
			System.out.println("수");
		}else if (score >= 80) {
			System.out.println("우");
		}else if (score >= 70) {
			System.out.println("미");
		}else if (score >= 60) {
			System.out.println("양");
		}else {
			System.out.println("가");
		}
		 */


		/*
		// 위와 다른 방법
		int score = 90;
		int i = 50;
		int[] array = new int[11];
		String[] str = {"가","양","미","우","수"} ;
		array[7] = 60;
		array[8] = 70;
		array[9] = 80;
		array[10] = 90;
		while(true) {
		i = i+10;
			if (score > 100 || score < 0) {
				System.out.println("잘못된 점수");
				break;
			}else
			if (score>i && score <= i+10) {
				System.out.println(str[((int)i/10-5)]);
				break;
			}else if (score > 60) {
				continue;
			}else {System.out.println(str[0]); break;}
		} 
		 */

		/*
		for(int i=0 ; i<=100 ; i++) {

			System.out.println(i+("번째 hello java"));
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		 */
		/*
		int i = 1*-1;
		while (i<0) {
			System.out.println("image"+i * -1);
			i = i + 1;
		}
		 */

		/*
		 // 2, 1, 0 순으로
		int i = 0;
		do {
			System.out.println("hani" + (i*15+1) + ".jpg");
			i = i +1;
		}while(i < 3);
		 */



	}

}
