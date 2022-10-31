package com.helpers.app.admin.vo;

public class AdminQnaVO {
	private String userName;
	private String userId;
	private String qnaTitle;
	private String mobileNumber;
	private String email;
	
	public AdminQnaVO() {;}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getQnaTitle() {
		return qnaTitle;
	}
	public void setQnaTitle(String qnaTitle) {
		this.qnaTitle = qnaTitle;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "AdminQnaVO [userName=" + userName + ", userId=" + userId + ", qnaTitle=" + qnaTitle + ", mobileNumber="
				+ mobileNumber + ", email=" + email + "]";
	}
	
	
}
