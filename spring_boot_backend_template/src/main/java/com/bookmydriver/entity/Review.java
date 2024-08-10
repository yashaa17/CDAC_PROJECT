package com.bookmydriver.entity;

import javax.persistence.*;

@Entity
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reviewId;

    @ManyToOne
    @JoinColumn(name = "bookingId")
    private Booking booking;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    @ManyToOne
    @JoinColumn(name = "driverId")
    private Driver driver;

    private Double rating;
    private String reviewText;
	public Review() {
		super();
	}
	public Review(Long reviewId, Booking booking, User user, Driver driver, Double rating, String reviewText) {
		super();
		this.reviewId = reviewId;
		this.booking = booking;
		this.user = user;
		this.driver = driver;
		this.rating = rating;
		this.reviewText = reviewText;
	}
	public Long getReviewId() {
		return reviewId;
	}
	public void setReviewId(Long reviewId) {
		this.reviewId = reviewId;
	}
	public Booking getBooking() {
		return booking;
	}
	public void setBooking(Booking booking) {
		this.booking = booking;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Driver getDriver() {
		return driver;
	}
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	public Double getRating() {
		return rating;
	}
	public void setRating(Double rating) {
		this.rating = rating;
	}
	public String getReviewText() {
		return reviewText;
	}
	public void setReviewText(String reviewText) {
		this.reviewText = reviewText;
	}
	@Override
	public String toString() {
		return "Review [reviewId=" + reviewId + ", booking=" + booking + ", user=" + user + ", driver=" + driver
				+ ", rating=" + rating + ", reviewText=" + reviewText + "]";
	}

    
}

