package naver.man10_49.a211129;

import java.sql.Date;

public class UserWriteDTO {
	
	private int uwnum;
	private String uinn;
	private String uwcn;
	private String uwip;
	private Date uwdate;
	public int getUwnum() {
		return uwnum;
	}
	public void setUwnum(int uwnum) {
		this.uwnum = uwnum;
	}
	public String getUinn() {
		return uinn;
	}
	public void setUinn(String uinn) {
		this.uinn = uinn;
	}
	public String getUwcn() {
		return uwcn;
	}
	public void setUwcn(String uwcn) {
		this.uwcn = uwcn;
	}
	public String getUwip() {
		return uwip;
	}
	public void setUwip(String uwip) {
		this.uwip = uwip;
	}
	public Date getUwdate() {
		return uwdate;
	}
	public void setUwdate(Date uwdate) {
		this.uwdate = uwdate;
	}
	
	@Override
	public String toString() {
		return "UserWriteDTO [uwnum=" + uwnum + ", uinn=" + uinn + ", uwcn=" + uwcn + ", uwip=" + uwip + ", uwdate="
				+ uwdate + "]";
	}
	
	
}
