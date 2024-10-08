package com.bookmydriver.service.impl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookmydriver.dto.BookingDTO;
import com.bookmydriver.entity.Booking;
import com.bookmydriver.entity.Driver;
import com.bookmydriver.repository.BookingRepository;
import com.bookmydriver.repository.DriverRepository;
import com.bookmydriver.repository.PaymentRepository;
import com.bookmydriver.repository.UserRepository;
import com.bookmydriver.service.BookingService;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private DriverRepository	driverRepository;

    @Autowired
    private PaymentRepository paymentRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<BookingDTO> getAllBookings() {
        return bookingRepository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    @Override
    public BookingDTO getBookingById(Long bookingId) {
        return bookingRepository.findById(bookingId).map(this::convertToDTO).orElse(null);
    }

    @Override
    public BookingDTO createBooking(BookingDTO bookingDTO) {
//        Booking booking = convertToEntity(bookingDTO);
//    	'2011-12-03T10:15:30
    	Driver driver = driverRepository.findById(bookingDTO.getDriverId()).get();

    	Booking booking = new Booking();
    	booking.setBookingId(bookingDTO.getBookingId());
    	booking.setDestination(bookingDTO.getDestination());
    	booking.setDriver(driver);
    	booking.setEndTime(LocalDateTime.parse(bookingDTO.getEndTime(), DateTimeFormatter.ISO_DATE_TIME));
    	booking.setStartTime(LocalDateTime.parse(bookingDTO.getStartTime(), DateTimeFormatter.ISO_DATE_TIME));
    	booking.setVehicleName(bookingDTO.getVehicleName());

    	booking.setUser(this.userRepository.findById(bookingDTO.getUserId()).get());
        Booking savedBooking = bookingRepository.save(booking);
        return convertToDTO(savedBooking);
    }

    @Override
    public BookingDTO updateBooking(Long bookingId, BookingDTO bookingDTO) {
        Booking booking = convertToEntity(bookingDTO);
        booking.setBookingId(bookingId);
        Booking updatedBooking = bookingRepository.save(booking);
        return convertToDTO(updatedBooking);
    }

    @Override
    public void deleteBooking(Long bookingId) {
        bookingRepository.deleteById(bookingId);
    }

    private BookingDTO convertToDTO(Booking booking) {
        BookingDTO bookingDTO = new BookingDTO();
        bookingDTO.setBookingId(booking.getBookingId());
        bookingDTO.setUserId(booking.getUser().getUserId());
        bookingDTO.setDriverId(booking.getDriver().getDriverId());
        bookingDTO.setVehicleName(booking.getVehicleName());
        bookingDTO.setStartTime(booking.getStartTime().toString());
        bookingDTO.setEndTime(booking.getEndTime().toString());
        bookingDTO.setDestination(booking.getDestination());
        return bookingDTO;
    }

    private Booking convertToEntity(BookingDTO bookingDTO) {
        Booking booking = new Booking();
        // Set fields from bookingDTO to booking entity
        return booking;
    }
}
