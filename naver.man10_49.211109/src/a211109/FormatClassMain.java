package a211109;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatClassMain {

	public static void main(String[] args) {
		Date date = new Date();
		double number = 3983434;
		
		//날짜 및 시간을
		//년도 4자리 월 2자리 일 2자리 요일
		//오전오후 시간 2자리 분 2자리 일 2자리로 출력
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 EEE a hh시 mm분 ss초");
		String result = sdf.format(date);
		System.out.println(result);
		
		//숫자에 통화기호와 천단위 구분 기호를 삽입
		DecimalFormat df = new DecimalFormat("\u00A4 #,###");
		result = df.format(number);
		System.out.println(result);
		
	}

}
