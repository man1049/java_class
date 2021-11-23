package naver.man10_49.a211115;

import static org.junit.Assert.*;

import org.junit.Test;


public class Test3 {
	@Test
	public void test() {
		int res = new Sample().sumint(100, 200);
		int i = 300;
		assertEquals(res, i);
	}
}
