package Bean;

import java.util.ArrayList;

public class UserBean {
	private String userId;
	private String userName;
	private String userPw;
	private String userPhone;
	private String userAddr;
	private ArrayList<NoteBean> noteBean;
	
	
	
	public ArrayList<NoteBean> getNoteBean() {
		return noteBean;
	}
	public void setNoteBean(ArrayList<NoteBean> noteBean) {
		this.noteBean = noteBean;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserAddr() {
		return userAddr;
	}
	public void setUserAddr(String userAddr) {
		this.userAddr = userAddr;
	}
}
