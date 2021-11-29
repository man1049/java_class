package naver.man10_49.a211129;

import java.sql.Date;

public class UserReflyDTO {
	
	private int uwnum;
	private String uinn;
	private int urnum;
	private String urcn;
	private String urip;
	private Date urdate;
	
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
	public int getUrnum() {
		return urnum;
	}
	public void setUrnum(int urnum) {
		this.urnum = urnum;
	}
	public String getUrcn() {
		return urcn;
	}
	public void setUrcn(String urcn) {
		this.urcn = urcn;
	}
	public String getUrip() {
		return urip;
	}
	public void setUrip(String urip) {
		this.urip = urip;
	}
	public Date getUrdate() {
		return urdate;
	}
	public void setUrdate(Date urdate) {
		this.urdate = urdate;
	}
	
	@Override
	public String toString() {
		return "UserReflyDTO [uwnum=" + uwnum + ", uinn=" + uinn + ", urnum=" + urnum + ", urcn=" + urcn + ", urip="
				+ urip + ", urdate=" + urdate + "]";
	}

	
	
}
