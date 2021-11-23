package naver.man10_49.a211117;

import org.junit.Test;

import junit.framework.Assert;

public class Test3 {
	@Test
	public void test() {
		int result = new Sample().intAddWithInt(100, 200);
		int i = 400;
		//두개의 값이 같으면 정상 종료 되지만 다르면 예외가 발생
		Assert.assertEquals(result, i);
		
	}
}
