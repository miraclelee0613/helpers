package com.helpers.app.admin.vo;

public class AdminPostVO {
	private String userName;
	private int userAge;
	private String postTitle;
	private String mobileNumber;
	private String email;
	
	public AdminPostVO() {;}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "AdminPostVO [userName=" + userName + ", userAge=" + userAge + ", postTitle=" + postTitle
				+ ", mobileNumber=" + mobileNumber + ", email=" + email + "]";
	}
}
