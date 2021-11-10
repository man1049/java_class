package naver.man10_49.Practice;

public class Practice_6 {

	public static void main(String[] args) {
		// 2016년 요일찾기 2016년 1월 1일은 금요일
		String[] week = {"FRI","SAT","SUN","MON","TUE","WED","THU","FRI"};
		//해당 달의 첫 요일을 0~6으로 기입
        int[] m_days_week = {5,1,2,5,0,3,5,1,4,6,2,4};
		int a = 1;
		int b = 21;
		
		//1월21일 실제달력으로 목요일입니다.
		//a-1로 m_days_week의 해당 달의 첫날 요일을 가져옵니다.
		//가져온값인 5+b를 해주고 %7의 나머지값을 계산하여 +1을 해줍니다.
		// 5+b = 26%7 = 5+1 = 6
		//week[6] = THU 목요일입니다.
		System.out.println(week[(m_days_week[a-1]+b)%7+1]);
		
	}
}
