package com.helpers.app.admin.vo;

public class AdminUserListVO {
	private int memberNumber;
	private String userName;
	private int userAge;
	private String userId;
	private String mobileNumber;
	private String eamil;
	private String joinDate;
	private int postNumber;
	private int qnaNumber;
	
	public AdminUserListVO() {;}

	public int getMemberNumber() {
		return memberNumber;
	}

	public void setMemberNumber(int memberNumber) {
		this.memberNumber = memberNumber;
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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

	public String getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}

	public int getPostNumber() {
		return postNumber;
	}

	public void setPostNumber(int postNumber) {
		this.postNumber = postNumber;
	}

	public int getQnaNumber() {
		return qnaNumber;
	}

	public void setQnaNumber(int qnaNumber) {
		this.qnaNumber = qnaNumber;
	}

	@Override
	public String toString() {
		return "AdminUserListVO [memberNumber=" + memberNumber + ", userName=" + userName + ", userAge=" + userAge
				+ ", userId=" + userId + ", mobileNumber=" + mobileNumber + ", eamil=" + eamil + ", joinDate="
				+ joinDate + ", postNumber=" + postNumber + ", qnaNumber=" + qnaNumber + "]";
	}
}