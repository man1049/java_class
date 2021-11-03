package singleton;

public class ManImpl {
	//1. private로 생성시 외부에선 instance 생성 X
	private ManImpl() {}
	
	//2.자신의 클래스 타입으로 static 변수를 생성
	private static ManImpl man;
	
	//3.static 변수가 null 일 때 인스턴스를 생성하는 static 메서드를 생성
	public static ManImpl getInstance() {
		if(man == null) {
			man = new ManImpl();
		}
			return man;
	}
}
