package com.bookmydriver.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookmydriver.dto.DriverDTO;
import com.bookmydriver.service.DriverService;

@RestController
//@RequestMapping("/drivers")
@RequestMapping("/v1/drivers")
//@CrossOrigin("*")
public class DriverController {

    private final DriverService driverService;

    public DriverController(DriverService driverService) {
        this.driverService = driverService;
    }

    @GetMapping
    public List<DriverDTO> getAllDrivers() {
        return driverService.getAllDrivers();
    }

    @GetMapping("/{driverId}")
    public DriverDTO getDriverById(@PathVariable Long driverId) {
        return driverService.getDriverById(driverId);
    }

    @PostMapping
    public DriverDTO createDriver(@RequestBody DriverDTO driverDTO) {
        return driverService.createDriver(driverDTO);
    }

    @PutMapping("/{driverId}")
    public DriverDTO updateDriver(@PathVariable Long driverId, @RequestBody DriverDTO driverDTO) {
        return driverService.updateDriver(driverId, driverDTO);
    }

    @DeleteMapping("/{driverId}")
    public void deleteDriver(@PathVariable Long driverId) {
        driverService.deleteDriver(driverId);
    }
}

