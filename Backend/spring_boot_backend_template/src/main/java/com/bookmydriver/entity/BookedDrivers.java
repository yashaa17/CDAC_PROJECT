package com.bookmydriver.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.lang.NonNull;

@Entity
public class BookedDrivers {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@NonNull
	@OneToOne
	private Driver driver;
	
	@NonNull
	@OneToOne
	private User user;
//	If active then true ,not active then false
	private boolean status;
	
	public BookedDrivers() {}
	
	public BookedDrivers(long id, Driver driver, User user, boolean status) {
		super();
		this.id = id;
		this.driver = driver;
		this.user = user;
		this.status = status;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
	public boolean isStatus() {
		return status;
	}
	public Driver getDriver() {
		return driver;
	}
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
}
