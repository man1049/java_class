package a211109;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateMain {

	public static void main(String[] args) {
		//오늘부터 1986년 5월 5일까지 지나온 날짜 계산
		
		//1986년 5월 5일 Calendar 객체로 생성
		Calendar meetday = new GregorianCalendar(1986,5,5);
		
		//오늘 날짜 만들기
		Calendar today = new GregorianCalendar();
		
		System.out.println(today.getTime());
	
		//epoch time으로 변환해서 뺴기
		long cha = (meetday.getTimeInMillis()-today.getTimeInMillis())*-1;
		long second = cha / 1000; // 초단위
		long minute = second / 60;
		long hour = minute / 60;
		long days = hour / 24;
		System.out.println(days);
		
		//Calendar를 Date 로 변환
		Date date =new Date(today.getTimeInMillis());
		
		//Date 객체를 가지고 Calendar로 변환
		Calendar cal = Calendar.getInstance();
		//cal.setTime();
		
	}

}
