package gameinfo;

import java.util.Scanner;

public class GameinfoController {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		final String WRITE = "1";
		final String DELETE = "2";
		final String INFO = "3";
		final String UPDATE = "4";
		final String ADMIN_LOGIN = "5";
		final String ADMIN_LOGOUT = "6";
		final String EXIT = "7";
		
		//1 - 작성
		//2 - 삭제
		//3 - 조회
		//4 - 수정
		//5 - 어드민 로그인
		//6 - 어드민 로그아웃
		//7 - 종료
		//나머지 재입력 요청
		GameinfoService gs = new GameinfoServiceImpl();
		
		while(true) {
			System.out.print("메뉴 입력 : ");
			String menu = sc.nextLine();
			//분기
			switch(menu) {
			
			case WRITE :
				
				gs.gameinfo_writing(null);
				break;
			
			case DELETE :
				
				gs.gameinfo_delete(0);
				break;
			
			case INFO :
				
				gs.gameinfo(null, null, null, 0, 0);
				break;
			
			case UPDATE :
				
				/*if(gs.admin(false) == true)
				{
					System.out.println("어드민 로그인이 필요합니다.");
					break;
				}
				*/
				gs.gameinfo_update(null);
				break;
				
			case ADMIN_LOGIN :
				
				System.out.print("비밀번호 : ");
				String admin_pw_type = sc.nextLine();
				
				
			case ADMIN_LOGOUT :
				
				
				break;
				
			case EXIT :
				
				System.out.println("종료합니다");
				break;
			}
			if(menu.equals(EXIT)) {
				break;
			}
		}
		sc.close();

	}

}
