package naver.man10_49.Practice;


import java.util.Calendar;
import java.util.GregorianCalendar;

public class Practice_6 {

	public static void main(String[] args) {
		// 2016년 요일찾기 2016년 1월 1일은 금요일
		String[] week = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
		int a = 1;
		int b = 3;
		Calendar cal = new GregorianCalendar(2016, 1, 1);
		Calendar cal2 = new GregorianCalendar(2016,a,b);
		
		long days = (cal2.getTimeInMillis()/1000/60/60/24) - (cal.getTimeInMillis()/1000/60/60/24);
		System.out.println( week[(int) (days%7)]);
		
		
		
		
	}

}
