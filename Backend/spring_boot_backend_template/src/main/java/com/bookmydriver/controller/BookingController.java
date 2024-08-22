
package com.bookmydriver.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookmydriver.dto.BookingDTO;
import com.bookmydriver.service.BookingService;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

@RestController
//@RequestMapping("/bookings")
@RequestMapping("/v1/bookings")

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

//    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @PostMapping("/add")
    public BookingDTO createBooking(@RequestBody BookingDTO bookingDTO) {
    	System.out.println("bookingDTO :-.......... "+bookingDTO);
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
