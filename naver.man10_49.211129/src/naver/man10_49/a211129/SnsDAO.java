package naver.man10_49.a211129;

public interface SnsDAO {
	
	public String idcheck(String id); // 아이디 체크
	public String nncheck(String nn); // 닉네임 체크
	public String emcheck(String em); // 이메일 체크
	
	public int join(UserInfoDTO uid); // 회원가입
	public boolean login(String id, String pw); // 로그인
	public UserInfoDTO getMe(String nn); // 정보가져오기
	public int infomodi(UserInfoDTO uid); //정보수정
	public int infodel(int uinum); // 회원탈퇴
	
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
	
	
	
	
	
}
