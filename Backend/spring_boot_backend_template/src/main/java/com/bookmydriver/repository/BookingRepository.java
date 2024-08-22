package com.bookmydriver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookmydriver.entity.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
}
