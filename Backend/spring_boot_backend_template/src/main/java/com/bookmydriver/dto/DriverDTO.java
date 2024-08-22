package com.bookmydriver.dto;

public class DriverDTO {
    private Long driverId;
    private String email;
    private String phoneNo;
    private String driverName;
    private Double rating;
    private String password;
    public DriverDTO(){}
	public DriverDTO(Long driverId, String email, String phoneNo, String driverName, Double rating, String password) {
		super();
		this.driverId = driverId;
		this.email = email;
		this.phoneNo = phoneNo;
		this.driverName = driverName;
		this.rating = rating;
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getDriverId() {
		return driverId;
	}
	public void setDriverId(Long driverId) {
		this.driverId = driverId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public Double getRating() {
		return rating;
	}
	public void setRating(Double rating) {
		this.rating = rating;
	}


}
