package naver.man10_49.autospamfree;


import javax.swing.*;


@SuppressWarnings("serial")
public class AutoSpamLoginFrame extends JFrame  {

	AutoSpamLoginFrame(String code){
		JOptionPane.showMessageDialog(null, "블로그,카페,사이트에서 배포를 한 적이없으며 다른경로로 다운 받은경우 사용을 금지합니다. (해킹툴 위험)", "문의 : man10_49@naver.com", JOptionPane.WARNING_MESSAGE);
		String id = JOptionPane.showInputDialog( null, "아이디 입력","Login",JOptionPane.PLAIN_MESSAGE);
		String pw = JOptionPane.showInputDialog( null, "비밀번호 입력", "Login",JOptionPane.PLAIN_MESSAGE);
		new AutoSpamFrame(id,pw,code);
	}


}
