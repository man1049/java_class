package naver.man10_49.a211124;

import java.util.List;

public interface UserInfoDAO {
	//여러개의 데이터를 가져오는 메서드 - 목록보기
	//페이징에 익숙해지면 여기 매개변수는 페이지 번호입니다.
	public List<UserInfoDTO> getList();
	
	
	//기본키를 가지고 하나의 데이터를 가져오는 메서드 - 상세보기
	
	public UserInfoDTO getUserInfo(int uinum);
	
	//데이터를 삽입하는 메서드
	
	public int insertUserInfo(UserInfoDTO userinfodto);
	
	//기본키를 가지고 데이터를 수정하는 메서드
	
	public int updateUserInfo(UserInfoDTO userinfodto);
	
	//기본키를 가지고 데이터를 삭제하는 메서드

	public int deleteUserInfo(int uinum);

}
