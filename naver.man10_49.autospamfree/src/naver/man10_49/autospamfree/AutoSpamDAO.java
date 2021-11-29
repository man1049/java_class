package naver.man10_49.autospamfree;

public interface AutoSpamDAO {
	
	public boolean todayFree(String id,String pw);
	public boolean todayNc(String id,String pw);
	public boolean Uami(String id,String pw);
	public boolean todayServer(String id,String pw);
	public boolean linPlay(String id,String pw);
	public void autoSpamExit(String code);
	
}
