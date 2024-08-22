package com.bookmydriver.service;

import java.util.HashMap;
import java.util.List;

import com.bookmydriver.dto.PaymentDTO;

public interface PaymentService {
    List<HashMap> getAllPayments();
    PaymentDTO getPaymentById(Long paymentId);
    PaymentDTO createPayment(PaymentDTO paymentDTO);
    PaymentDTO updatePayment(Long paymentId, PaymentDTO paymentDTO);
    void deletePayment(Long paymentId);
}
