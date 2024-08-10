package com.bookmydriver.controller;

import com.bookmydriver.dto.BookingDTO;
import com.bookmydriver.service.BookingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @GetMapping
    public List<BookingDTO> getAllBookings() {
        return bookingService.getAllBookings();
    }

    @GetMapping("/{bookingId}")
    public BookingDTO getBookingById(@PathVariable Long bookingId) {
        return bookingService.getBookingById(bookingId);
    }

    @PostMapping
    public BookingDTO createBooking(@RequestBody BookingDTO bookingDTO) {
        return bookingService.createBooking(bookingDTO);
    }

    @PutMapping("/{bookingId}")
    public BookingDTO updateBooking(@PathVariable Long bookingId, @RequestBody BookingDTO bookingDTO) {
        return bookingService.updateBooking(bookingId, bookingDTO);
    }

    @DeleteMapping("/{bookingId}")
    public void deleteBooking(@PathVariable Long bookingId) {
        bookingService.deleteBooking(bookingId);
    }
}
