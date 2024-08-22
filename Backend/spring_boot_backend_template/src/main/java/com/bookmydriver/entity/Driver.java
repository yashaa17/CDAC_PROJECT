package com.bookmydriver.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long driverId;

    private String email;
    private String phoneNo;
    private String driverName;
    private Double rating;
    private String password;

//    @OneToOne(mappedBy = "driver")
//    private Booking bookings;

    @OneToMany(mappedBy = "driver")
    private List<Review> reviews;

	public Driver() {
		super();
	}



	public Driver(Long driverId, String email, String phoneNo, String driverName, Double rating, String password,
			List<Review> reviews) {
		super();
		this.driverId = driverId;
		this.email = email;
		this.phoneNo = phoneNo;
		this.driverName = driverName;
		this.rating = rating;
		this.password = password;
		this.reviews = reviews;
	}



	public Driver(Long driverId, String email, String phoneNo, String driverName, Double rating, List<Review> reviews) {
		super();
		this.driverId = driverId;
		this.email = email;
		this.phoneNo = phoneNo;
		this.driverName = driverName;
		this.rating = rating;
		this.reviews = reviews;
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


	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}



	@Override
	public String toString() {
		return "Driver [driverId=" + driverId + ", email=" + email + ", phoneNo=" + phoneNo + ", driverName="
				+ driverName + ", rating=" + rating + ", password=" + password + ", reviews=" + reviews + "]";
	}






}

