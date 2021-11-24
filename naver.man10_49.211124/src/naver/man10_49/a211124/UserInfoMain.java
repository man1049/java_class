package naver.man10_49.a211124;

import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

public class UserInfoMain {
	


	public static void main(String[] args) {
		//UserInfoDAO 인스턴스 생성
		UserInfoDAO userinfoDAO = UserInfoDAOImpl.sharedInstance();
		/*
		//데이터 호출
		List<UserInfoDTO> list = userinfoDAO.getList();
		for(UserInfoDTO uidto : list) {
			System.out.println(uidto);
		}
		*/
		//데이터 1개 가져오기
		UserInfoDTO ui= userinfoDAO.getUserInfo(1);
		if(ui == null) {
			System.out.println("데이터가 없음");
		}else {
			System.out.println(ui);
		}
		
		
	}

}
