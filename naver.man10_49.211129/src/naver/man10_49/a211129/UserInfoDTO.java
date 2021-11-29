package naver.man10_49.a211129;

import java.sql.Date;

public class UserInfoDTO {
	private int uinum;
	private String uiid;
	private String uipw;
	private String uinn;
	private String uiem;
	private String uipt;
	private String uiip;
	private Date uidate = null;
	
	public int getUinum() {
		return uinum;
	}
	public void setUinum(int uinum) {
		this.uinum = uinum;
	}
	public String getUiid() {
		return uiid;
	}
	public void setUiid(String uiid) {
		this.uiid = uiid;
	}
	public String getUipw() {
		return uipw;
	}
	public void setUipw(String uipw) {
		this.uipw = uipw;
	}
	public String getUinn() {
		return uinn;
	}
	public void setUinn(String uinn) {
		this.uinn = uinn;
	}
	public String getUiem() {
		return uiem;
	}
	public void setUiem(String uiem) {
		this.uiem = uiem;
	}
	public String getUipt() {
		return uipt;
	}
	public void setUipt(String uipt) {
		this.uipt = uipt;
	}
	public String getUiip() {
		return uiip;
	}
	public void setUiip(String uiip) {
		this.uiip = uiip;
	}
	public Date getUidate() {
		return uidate;
	}
	public void setUidate(Date uidate) {
		this.uidate = uidate;
	}
	@Override
	public String toString() {
		return "UserInfoDTO [uinum=" + uinum + ", uiid=" + uiid + ", uipw=" + uipw + ", uinn=" + uinn + ", uiem=" + uiem
				+ ", uipt=" + uipt + ", uiip=" + uiip + ", uidate=" + uidate + ", getUinum()=" + getUinum()
				+ ", getUiid()=" + getUiid() + ", getUipw()=" + getUipw() + ", getUinn()=" + getUinn() + ", getUiem()="
				+ getUiem() + ", getUipt()=" + getUipt() + ", getUiip()=" + getUiip() + ", getUidate()=" + getUidate()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
