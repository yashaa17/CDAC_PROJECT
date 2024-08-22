package com.bookmydriver.dto;

public class UserDTO {
    private Long userId;
    private String emailId;
    private String phoneNo;
    private String userName;
    private String password;

	public UserDTO() {
		super();
	}
	public UserDTO(Long userId, String emailId, String phoneNo, String userName) {
		super();
		this.userId = userId;
		this.emailId = emailId;
		this.phoneNo = phoneNo;
		this.userName = userName;

	}


	public UserDTO(Long userId, String emailId, String phoneNo, String userName, String password) {
		super();
		this.userId = userId;
		this.emailId = emailId;
		this.phoneNo = phoneNo;
		this.userName = userName;
		this.password = password;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserDTO [userId=" + userId + ", emailId=" + emailId + ", phoneNo=" + phoneNo + ", userName=" + userName
				+ ", password=" + password + "]";
	}


}
