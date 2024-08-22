package com.bookmydriver.service;

import java.util.List;

import com.bookmydriver.dto.DriverDTO;

public interface DriverService {
    List<DriverDTO> getAllDrivers();
    DriverDTO getDriverById(Long driverId);
    DriverDTO createDriver(DriverDTO driverDTO);
    DriverDTO updateDriver(Long driverId, DriverDTO driverDTO);
    void deleteDriver(Long driverId);
}

