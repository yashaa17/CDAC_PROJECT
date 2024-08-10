package com.bookmydriver.service;

import com.bookmydriver.dto.BookingDTO;
import java.util.List;

public interface BookingService {
    List<BookingDTO> getAllBookings();
    BookingDTO getBookingById(Long bookingId);
    BookingDTO createBooking(BookingDTO bookingDTO);
    BookingDTO updateBooking(Long bookingId, BookingDTO bookingDTO);
    void deleteBooking(Long bookingId);
}

