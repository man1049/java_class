package gameinfo;

public class GameinfoServiceImpl implements GameinfoService {

	@Override
	public boolean gameinfo_writing(Game game) {
		System.out.println("글 작성");
		return false;
	}

	@Override
	public boolean gameinfo_delete(int admin) {
		System.out.println("글 삭제");
		return false;
	}

	@Override
	public Game gameinfo(String name, String date, String jangrr, int price, double score) {
		System.out.println("글 조회");
		return null;
	}

	@Override
	public boolean gameinfo_update(Game game) {
		System.out.println("글 수정");
		return false;
	}

	@Override
	public boolean admin(boolean admin) {
		System.out.println("운영자 여부");
		return false;
	}
	
	@Override
	public boolean admin_login(String admin_pw) {
		System.out.println("운영자 로그인");
		return false;
	}

}
