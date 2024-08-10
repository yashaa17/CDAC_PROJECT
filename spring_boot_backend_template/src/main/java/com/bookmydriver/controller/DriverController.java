package com.bookmydriver.controller;

import com.bookmydriver.dto.DriverDTO;
import com.bookmydriver.service.DriverService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/drivers")
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

