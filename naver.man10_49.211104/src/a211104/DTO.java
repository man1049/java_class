package a211104;

public class DTO {
	private int num;
	private String name;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "DTO [num=" + num + ", name=" + name + "]";
	}
	
	//인스턴스의 내용이 같은지 비교하는 메서드
	public boolean equals(DTO other) {
		
		if(num == other.num && name.equals(other.name)) {
			return true;
		}
		
		return false;
	}
	
	public DTO clone() {
		DTO other = new DTO();
		
		other.num = num;
		other.name = new String(name);
		
		return other;
	}
	
}
