package com.bookmydriver.service;

import java.util.List;

import com.bookmydriver.dto.BookingDTO;

public interface BookingService {
    List<BookingDTO> getAllBookings();
    BookingDTO getBookingById(Long bookingId);
    BookingDTO createBooking(BookingDTO bookingDTO);
    BookingDTO updateBooking(Long bookingId, BookingDTO bookingDTO);
    void deleteBooking(Long bookingId);
}

