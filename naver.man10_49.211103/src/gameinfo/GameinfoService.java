package gameinfo;

public interface GameinfoService {
	//정보 게시를 위한 처리
	public boolean gameinfo_writing(Game game);
	//정보 삭제를 위한 처리
	public boolean gameinfo_delete(int admin);
	//정보 출력을 위한 처리
	public Game gameinfo(String name, String date , String jangrr , int price , double score);
	//정보 수정을 위한 처리
	public boolean gameinfo_update(Game game);
	//어드민 여부
	public boolean admin(boolean admin);
	//어드민 로그인
	public boolean admin_login(String admin_pw);
	
	
}
