package com.helpers.app.admin.vo;

public class AdminCertificateVO {
	private String userName;
	private String userId;
	private String postTitle;
	private String mobileNumber;
	private String eamil;
	private String completedDate;
	private String issuedDate;
	
	public AdminCertificateVO() {;}

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

	public String getPostTitle() {
		return postTitle;
	}

	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEamil() {
		return eamil;
	}

	public void setEamil(String eamil) {
		this.eamil = eamil;
	}

	public String getCompletedDate() {
		return completedDate;
	}

	public void setCompletedDate(String completedDate) {
		this.completedDate = completedDate;
	}

	public String getIssuedDate() {
		return issuedDate;
	}

	public void setIssuedDate(String issuedDate) {
		this.issuedDate = issuedDate;
	}

	@Override
	public String toString() {
		return "AdminCertificateVO [userName=" + userName + ", userId=" + userId + ", postTitle=" + postTitle
				+ ", mobileNumber=" + mobileNumber + ", eamil=" + eamil + ", completedDate=" + completedDate
				+ ", issuedDate=" + issuedDate + "]";
	}
}
