package naver.man10_49.a211129;

public interface SnsDAO {
	
	public void closeconnect();
	
	public boolean idcheck(String uiid); // 아이디 체크
	public boolean nncheck(String uinn); // 닉네임 체크
	public boolean emcheck(String uiem); // 이메일 체크
	
	public int join(UserInfoDTO uid); // 회원가입
	public boolean login(String uiid, String uipw); // 로그인
	public UserInfoDTO getInfo(String nn); // 정보가져오기
	public int infomodi(UserInfoDTO uid); //정보수정
	public int infodel(String uiid,String uipw); // 회원탈퇴
	/*
	public int writelist(int page); // 게시판 글목록
	public int write(UserWriteDTO uwd); // 글작성
	public int writemodi(UserWriteDTO uwd); // 글수정
	public int writedel(int uwnum); // 글삭제
	
	public int photoup(String[] uppt); //사진 업로드
	public int photodel(String[] uppt); //사진 삭제
	public int photomodi(String[] uppt); //사진 수정
	
	public int refly(UserReflyDTO urd); //리플 작성
	public int reflydel(int uwnum); // 리플 삭제
	public int reflymodi(UserReflyDTO urd); // 리플 수정
	*/
	
	
	
	
}
