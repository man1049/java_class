package naver.man10_49.autospamfree;

public interface AutoSpamDAO {
	
	public boolean todayFree();
	public boolean todayNc();
	public boolean Uami();
	public boolean todayServer();
	public boolean linPlay();
	public void autoSpamExit(String code);
	
}
