package com.bookmydriver.service.impl;

import com.bookmydriver.dto.DriverDTO;
import com.bookmydriver.entity.Driver;
import com.bookmydriver.repository.DriverRepository;
import com.bookmydriver.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DriverServiceImpl implements DriverService {

    @Autowired
    private DriverRepository driverRepository;

    @Override
    public List<DriverDTO> getAllDrivers() {
        return driverRepository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    @Override
    public DriverDTO getDriverById(Long driverId) {
        return driverRepository.findById(driverId).map(this::convertToDTO).orElse(null);
    }

    @Override
    public DriverDTO createDriver(DriverDTO driverDTO) {
        Driver driver = convertToEntity(driverDTO);
        Driver savedDriver = driverRepository.save(driver);
        return convertToDTO(savedDriver);
    }

    @Override
    public DriverDTO updateDriver(Long driverId, DriverDTO driverDTO) {
        Driver driver = convertToEntity(driverDTO);
        driver.setDriverId(driverId);
        Driver updatedDriver = driverRepository.save(driver);
        return convertToDTO(updatedDriver);
    }

    @Override
    public void deleteDriver(Long driverId) {
        driverRepository.deleteById(driverId);
    }

    private DriverDTO convertToDTO(Driver driver) {
        DriverDTO driverDTO = new DriverDTO();
        driverDTO.setDriverId(driver.getDriverId());
        driverDTO.setEmail(driver.getEmail());
        driverDTO.setPhoneNo(driver.getPhoneNo());
        driverDTO.setDriverName(driver.getDriverName());
        driverDTO.setRating(driver.getRating());
        return driverDTO;
    }

    private Driver convertToEntity(DriverDTO driverDTO) {
        Driver driver = new Driver();
        driver.setEmail(driverDTO.getEmail());
        driver.setPhoneNo(driverDTO.getPhoneNo());
        driver.setDriverName(driverDTO.getDriverName());
        driver.setRating(driverDTO.getRating());
        return driver;
    }
}

