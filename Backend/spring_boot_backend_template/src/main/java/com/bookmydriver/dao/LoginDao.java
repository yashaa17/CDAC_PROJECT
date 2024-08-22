package com.bookmydriver.dao;


public class LoginDao {
	private String email;
	private String password;


	public LoginDao() {}

	public LoginDao(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginDao [email=" + email + ", password=" + password + "]";
	}


}
