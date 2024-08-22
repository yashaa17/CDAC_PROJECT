package com.bookmydriver.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bookmydriver.entity.Payment;


@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {

	@Query(value = "from Payment p left join p.booking")
	List<Payment> findPayments();
}
