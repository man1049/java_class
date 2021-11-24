package naver.man10_49.a211124;

import java.sql.Date;

public class UserInfoDTO {
	
	private int uinum = 0;
	private Date uidate = null;
	private String uiname = null;
	private String uiaddress = null;
	private String uinickname = null;
	public int getUinum() {
		return uinum;
	}
	public void setUinum(int uinum) {
		this.uinum = uinum;
	}
	public Date getUidate() {
		return uidate;
	}
	public void setUidate(Date uidate) {
		this.uidate = uidate;
	}
	public String getUiname() {
		return uiname;
	}
	public void setUiname(String uiname) {
		this.uiname = uiname;
	}
	public String getUiaddress() {
		return uiaddress;
	}
	public void setUiaddress(String uiaddress) {
		this.uiaddress = uiaddress;
	}
	public String getUinickname() {
		return uinickname;
	}
	public void setUinickname(String uinickname) {
		this.uinickname = uinickname;
	}
	
	@Override
	public String toString() {
		return "UserInfoDTO [uinum=" + uinum + ", uidate=" + uidate + ", uiname=" + uiname + ", uiaddress=" + uiaddress
				+ ", uinickname=" + uinickname + "]";
	}
	
	
	
	
	
	
	
}
