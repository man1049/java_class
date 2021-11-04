package a211104;

import java.nio.channels.FileChannel;

public class ExceptionHandlingPrac {

	public static void main(String[] args) {
		
		try {
		int x = 10;
		int n = 2;
		
		int res = x / n ; 
		System.out.println("res : " + res);
			
			
		}catch (ArithmeticException e) {
			//ArithmeticException 이 발생했을 때 작동
			System.out.println("산술예외 : " + e.getLocalizedMessage());
			
		}finally{
			System.out.println("무조건 수행 할 내용");
			System.out.println("주로 외부자원 연결해제 코드를 작성");
		}
		
		// ar이 null 이므로 NullPointerException 발생
		// NullPointerException을 처리하는 구문이 없으면 프로그램 주안
		try {
			
		int[] ar = null;
		int size = ar.length;
		System.out.println("size : " + size);
		
		}catch (ArithmeticException e) {
			System.out.println("산술예외 : " + e.getLocalizedMessage());
		}catch (NullPointerException e) {
			System.out.println("Null예외 : " + e.getLocalizedMessage());
		}finally{
			System.out.println("무조건 수행 할 내용");
			System.out.println("주로 외부자원 연결해제 코드를 작성");
		}

	}

}
