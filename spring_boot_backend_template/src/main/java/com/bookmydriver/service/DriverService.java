package com.bookmydriver.service;

import com.bookmydriver.dto.DriverDTO;
import java.util.List;

public interface DriverService {
    List<DriverDTO> getAllDrivers();
    DriverDTO getDriverById(Long driverId);
    DriverDTO createDriver(DriverDTO driverDTO);
    DriverDTO updateDriver(Long driverId, DriverDTO driverDTO);
    void deleteDriver(Long driverId);
}

