package naver.man10_49.a211129;

import java.sql.SQLException;

public class SnsDAOImpl extends DAO implements SnsDAO {
	private static SnsDAO snsDAO;

	@Override
	public void closeconnect() {
		try {
			con.close();
			pstmt.close();
			rs.close();
		} catch (Exception e) {
			System.out.println("close Exception : "+e.getLocalizedMessage());
		}
	}

	public static SnsDAO sharedInstance() {
		if(snsDAO == null) {
			snsDAO = new SnsDAOImpl();
		}
		return snsDAO;
	}

	@Override
	public boolean idcheck(String id) {
		boolean res = false;

		try {
			pstmt = con.prepareStatement("Select uiid from UserInfo where uiid = ?");
			pstmt.setString(1, id.trim());
			rs = pstmt.executeQuery();
			res = rs.next();

		} catch (Exception e) {
			System.out.println("아이디 익셉션1 : "+e.getLocalizedMessage());
		}
		return res;
	}

	@Override
	public boolean nncheck(String nn) {
		boolean res = false;

		try {
			pstmt = con.prepareStatement("Select uinn from UserInfo where uinn = ?");
			pstmt.setString(1, nn);
			rs = pstmt.executeQuery();
			res = rs.next();

		} catch (Exception e) {
			System.out.println("닉네임 익셉션1 : "+e.getLocalizedMessage());
		}
		return res;
	}

	@Override
	public boolean emcheck(String em) {
		boolean res = false;

		try {
			pstmt = con.prepareStatement("Select uiem from UserInfo where uiem = ?");
			pstmt.setString(1, em);
			rs = pstmt.executeQuery();
			res = rs.next();
		} catch (Exception e) {
			System.out.println("이메일 익셉션1 : "+e.getLocalizedMessage());
		}
		return res;
	}

	@Override
	public int join(UserInfoDTO uid) {
		int res = -1;

		try {
			pstmt = con.prepareStatement("insert into UserInfo(uiid,uipw,uinn,uiem,uipt,uiip,uidate) values(?,?,?,?,?,?,?)");
			pstmt.setString(1, uid.getUiid());
			pstmt.setString(2, uid.getUipw());
			pstmt.setString(3, uid.getUinn());
			pstmt.setString(4, uid.getUiem());
			pstmt.setString(5, uid.getUipt());
			pstmt.setString(6, uid.getUiip());
			pstmt.setDate(7, uid.getUidate());

			res = pstmt.executeUpdate();

		} catch (SQLException e) {
			System.out.println("join Exception : "+e.getLocalizedMessage());
		}

		return res;
	}

	@Override
	public boolean login(String id, String pw) {
		boolean res = false;
		try {
			pstmt = con.prepareStatement("select uiid,uipw from UserInfo where uiid = ? and uipw = ?");
			pstmt.setString(1, id);
			pstmt.setString(2, pw);

			rs = pstmt.executeQuery();

			res = rs.next();



		} catch (Exception e) {
			System.out.println("login Exception : "+e.getLocalizedMessage());
		}
		return res;
	}

	@Override
	public UserInfoDTO getInfo(String nn) {
		UserInfoDTO uidto = new UserInfoDTO();

		try {
			pstmt = con.prepareStatement("select uinum,uiid,uipw,uinn,uiem,uipt,uiip,uidate from UserInfo where uinn = ?");
			pstmt.setString(1, nn);
			rs = pstmt.executeQuery();
			rs.first();
			uidto.setUinum(rs.getInt("uinum"));
			uidto.setUiid(rs.getString("uiid"));
			uidto.setUipw(rs.getString("uipw"));
			uidto.setUinn(rs.getString("uinn"));
			uidto.setUiem(rs.getString("uiem"));
			uidto.setUipt(rs.getString("uipt"));
			uidto.setUiip(rs.getString("uiip"));
			uidto.setUidate(rs.getDate("uidate"));
		} catch (Exception e) {
			System.out.println("getInfo Exception : "+e.getLocalizedMessage());
		}
		return uidto;
	}

	@Override
	public int infomodi(UserInfoDTO uid) {
		int res = -1;
		try {
			pstmt = con.prepareStatement("update UserInfo set uipw = ?,uinn = ?,uipt = ? where uiid = ?");
			//uipw = ?,uinn = ?,uiem = ?,uipt = ? 
			pstmt.setString(1, uid.getUipw());
			pstmt.setString(2, uid.getUinn());
			pstmt.setString(3, uid.getUipt());
			pstmt.setString(4, uid.getUiid());

			res = pstmt.executeUpdate();

		} catch (SQLException e) {
			System.out.println("infomodi Exception : "+e.getLocalizedMessage());
		}
		return res;
	}

	@Override
	public int infodel(String uiid,String uipw) {
		int res = -1;
		try {
			pstmt = con.prepareStatement("select uiid,uipw from UserInfo where uiid = ? and uipw = ?");
			pstmt.setString(1, uiid);
			pstmt.setString(2, uipw);

			rs = pstmt.executeQuery();

			if(rs.next()) {
				pstmt = con.prepareStatement("delete from UserInfo where uiid = ?");
				pstmt.setString(1, uiid);

				res = pstmt.executeUpdate();

				System.out.println("삭제완료");

			}else {
				System.out.println("삭제실패");
				return 0;
			}
		} catch(Exception e) {

		}

		return res;
	}
	

	

}
