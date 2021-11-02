package a211102;

public class Stair {
	
	// 번호 저장
	private int s_num;
	// 계단 이름을 저장 할 속성
	private String s_name;
	// 계단 수를 저장 할 속성
	private int s_count;
	
	//매개변수가 없는 생성자 - 리턴 X
	public Stair() {
		s_num = 0;
		s_name = "이름없음";
		s_count = 0;
	}
	
	public Stair(int n , String s , int i) {
		s_num = n;
		s_name = s;
		s_count = i;
	}
	
	public int getS_num() {
		return s_num;
	}

	public void setS_num(int s_num) {
		this.s_num = s_num;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public int getS_count() {
		return s_count;
	}

	public void setS_count(int s_count) {
		this.s_count = s_count;
	}
	
	@Override
	public String toString() {
		return s_num +". " +"\t 계단명 : " + s_name + "\t 계단수 : " + s_count;
	}
	
}
