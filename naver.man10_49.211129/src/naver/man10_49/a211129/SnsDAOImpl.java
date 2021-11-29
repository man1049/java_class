package naver.man10_49.a211129;

import java.sql.SQLException;

public class SnsDAOImpl extends DAO implements SnsDAO {
	private static SnsDAO snsDAO;

	public static SnsDAO sharedInstance() {
		if(snsDAO == null) {
			snsDAO = new SnsDAOImpl();
		}
		return snsDAO;
	}

	@Override
	public String idcheck(String id) {
		String res = null;

		try {
			pstmt = con.prepareStatement("Select uiid from UserInfo where uiid = ?");
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next() == true ) {
				System.out.println("중복입니다.");
				return null;
			}else {
				System.out.println("중복이 아닙니다.");
				return id;
			}
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		return res;
	}

	@Override
	public String nncheck(String nn) {
		String res = null;

		try {
			pstmt = con.prepareStatement("Select uinn from UserInfo where uinn = ?");
			pstmt.setString(1, nn);
			rs = pstmt.executeQuery();
			if(rs.next() == true ) {
				System.out.println("중복입니다.");
				return null;
			}else {
				System.out.println("중복이 아닙니다.");
				return nn;
			}
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		return res;
	}

	@Override
	public String emcheck(String em) {
		String res = null;

		try {
			pstmt = con.prepareStatement("Select uiem from UserInfo where uiem = ?");
			pstmt.setString(1, em);
			rs = pstmt.executeQuery();
			if(rs.next() == true ) {
				System.out.println("중복입니다.");
				return null;
			}else {
				System.out.println("중복이 아닙니다.");
				return em;
			}
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		return res;
	}

	@Override
	public int join(UserInfoDTO uid) {
		int res = 0;
		
		try {
			pstmt = con.prepareStatement("insert into UserInfo(uiid,uipw,uinn,uiem,uipt,uiip,uidate) values(?,?,?,?,?,?,?)");
			pstmt.setString(1, uid.getUiid());
			pstmt.setString(2, uid.getUipw());
			pstmt.setString(3, uid.getUinn());
			pstmt.setString(4, uid.getUiem());
			pstmt.setString(5, uid.getUipt());
			pstmt.setString(6, uid.getUiip());
			pstmt.setDate(7, uid.getUidate());
			
			rs = pstmt.executeQuery();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}

	@Override
	public boolean login(String id, String pw) {
		try {
			pstmt = con.prepareStatement("select uiid,uipw from UserInfo where uiid = ? and uipw = ?");
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			
			rs = pstmt.executeQuery();
			
			if(rs.next() == false) {
				return false;
			}else {
				return true;
			}
		} catch (SQLException e) {}
		return false;
	}

	@Override
	public UserInfoDTO getMe(String nn) {
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
		
		} catch (SQLException e) {}
		
		return uidto;
	}

	@Override
	public int infomodi(UserInfoDTO uid) {
		int res = 0;
		try {
			pstmt = con.prepareStatement("update UserInfo set uipw = ?,uinn = ?,uipt = ? where uiid = ?");
			//uipw = ?,uinn = ?,uiem = ?,uipt = ? 
			pstmt.setString(1, uid.getUipw());
			pstmt.setString(2, uid.getUinn());
			pstmt.setString(3, uid.getUipt());
			pstmt.setString(4, uid.getUiid());
			
			rs = pstmt.executeQuery();
			
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int infodel(int uinum) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int write(UserWriteDTO uwd) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int writemodi(UserWriteDTO uwd) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int writedel(int uwnum) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int photoup(String[] uppt) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int photodel(String[] uppt) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int photomodi(String[] uppt) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int refly(UserReflyDTO urd) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int reflydel(int uwnum) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int reflymodi(UserReflyDTO urd) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int writelist(int page) {
		// TODO Auto-generated method stub
		return 0;
	}

}
