package com.bookmydriver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookmydriver.entity.Driver;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {
}
