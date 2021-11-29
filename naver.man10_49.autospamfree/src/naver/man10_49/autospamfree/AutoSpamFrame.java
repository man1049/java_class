package naver.man10_49.autospamfree;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.text.BoxView;

public class AutoSpamFrame extends JFrame {

	boolean bl = false;

	AutoSpamFrame(String id, String pw, String code) {

		JOptionPane.showMessageDialog(null, "상업적 용도로 사용이 불가능합니다.", "문의 : man10_49@naver.com", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "인터넷창을 닫으시면 진행이 불가능합니다.", "문의 : man10_49@naver.com", JOptionPane.WARNING_MESSAGE);
		AutoSpamDAO asdao = AutoSpamDAOImpl.sharedInstance();
		BoxView bv = new BoxView(null, getDefaultCloseOperation());
		bv.append(bv);
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		JPanel jp4 = new JPanel();

		JLabel jv1 = new JLabel();
		JLabel jv2 = new JLabel();

		JButton btn1 = new JButton();	//btn1이라는 버튼 생성
		JButton btn2 = new JButton();	//btn2이라는 버튼 생성
		JButton btn3 = new JButton();	//btn3이라는 버튼 생성
		JButton btn4 = new JButton();	//btn4이라는 버튼 생성
		JButton btn5 = new JButton();	//btn5이라는 버튼 생성
		JButton btn6 = new JButton();	//btn6이라는 버튼 생성

		add(jp1);
		jp1.add(jp2);
		jp1.add(jp3);
		jp1.add(jp4);
		jp4.add(jv1);
		jp4.add(jv2);

		jp2.add(btn1);	//투데이프리
		jp2.add(btn2);	//투데이nc
		jp2.add(btn3);	//우아미넷
		jp2.add(btn4);	//투데이서버
		jp2.add(btn5);	//린플레이
		jp2.add(btn6);	//종료버튼

		btn1.setText("투데이프리");
		btn2.setText("투데이nc");
		btn3.setText("우아미넷");
		btn4.setText("투데이서버");
		btn5.setText("린플레이");
		btn6.setText("종료");

		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//AutoSpamDAO asdao = AutoSpamDAOImpl.sharedInstance();
				bl = asdao.todayFree(id, pw);
				if(bl == false) {
					JOptionPane.showMessageDialog(null, "재시도해주세요", "error-1", JOptionPane.ERROR_MESSAGE, null);
				}else {
					JOptionPane.showMessageDialog(null, "작성이 완료되었습니다.","알림", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});

		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//AutoSpamDAO asdao = AutoSpamDAOImpl.sharedInstance();
				bl = asdao.todayNc(id, pw);
				if(bl == false) {
					JOptionPane.showMessageDialog(null, "재시도해주세요","error-1", JOptionPane.ERROR_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null, "작성이 완료되었습니다.","알림", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});

		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//AutoSpamDAO asdao = AutoSpamDAOImpl.sharedInstance();
				bl = asdao.Uami(id, pw);
				if(bl == false) {
					JOptionPane.showMessageDialog(null, "재시도해주세요","error-1", JOptionPane.ERROR_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null, "자동등록방지를 입력 후 작성완료를 눌러주세요.","알림", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});

		btn4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//AutoSpamDAO asdao = AutoSpamDAOImpl.sharedInstance();
				bl = asdao.todayServer(id, pw);
				if(bl == false) {
					JOptionPane.showMessageDialog(null, "재시도해주세요","error-1", JOptionPane.ERROR_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null, "작성이 완료되었습니다.","알림", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});

		btn5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//AutoSpamDAO asdao = AutoSpamDAOImpl.sharedInstance();
				bl = asdao.linPlay(id, pw);
				if(bl == false) {
					JOptionPane.showMessageDialog(null, "재시도해주세요","error-1", JOptionPane.ERROR_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null, "자동등록방지를 입력 후 작성완료를 눌러주세요.","알림", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});

		btn6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					asdao.autoSpamExit(code);
				}catch(Exception ee) {}
				finally {
					System.exit(0);
				}
			}
		});

		setTitle("문의 : man10_49@naver.com");
		setVisible(true);	//창을 눈에 보이도록 함
		setSize(560, 100);	//사이즈는 560*100
		setResizable(false);	//사이즈 재조정 불가능
		setLocationRelativeTo(null);	//창이 가운데에 뜨도록 함
		setDefaultCloseOperation(EXIT_ON_CLOSE);	//창을 끄면 프로그램을 종료
	}

}
