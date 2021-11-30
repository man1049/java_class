package naver.man10_49.autospamfree;

import javax.swing.JOptionPane;

public class AutoSpamCheck {

	AutoSpamCheck(){
		try {
			int bool;
			AutoSpamCheckDAO ascidao = AutoSpamCheckDAOImpl.sharedInstance();
			String code = JOptionPane.showInputDialog( null, "코드를 입력하세요","Code",JOptionPane.PLAIN_MESSAGE);
			bool = ascidao.checkcode(code);
			if(bool == -1) {
				JOptionPane.showMessageDialog(null, "등록되지 않은 코드입니다.","정보없음", JOptionPane.ERROR_MESSAGE);
			}else if(bool == 0) {
				new AutoSpamLoginFrame(code);
			}else if(bool == 1) {
				JOptionPane.showMessageDialog(null, "공유된 코드로 판단하여 차단되었습니다.","사용불가", JOptionPane.ERROR_MESSAGE);
			}else if(bool == 2) {
				JOptionPane.showMessageDialog(null, "차단된 코드입니다.","사용불가", JOptionPane.ERROR_MESSAGE);
			}
		}catch (Exception e) {
			//System.out.println(e.getLocalizedMessage());
		}
	}
}
