package com.bookmydriver.entity;

import javax.persistence.*;

@Entity
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentId;

    @OneToOne
    @JoinColumn(name = "bookingId")
    private Booking booking;

    private Double amount;
    private String paymentMethod;
    private String paymentStatus;
    
	public Payment() {
		super();
	}

	public Payment(Long paymentId, Booking booking, Double amount, String paymentMethod, String paymentStatus) {
		super();
		this.paymentId = paymentId;
		this.booking = booking;
		this.amount = amount;
		this.paymentMethod = paymentMethod;
		this.paymentStatus = paymentStatus;
	}

	public Long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", booking=" + booking + ", amount=" + amount + ", paymentMethod="
				+ paymentMethod + ", paymentStatus=" + paymentStatus + "]";
	}
	
	

    
}

