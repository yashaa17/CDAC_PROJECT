package com.bookmydriver.service;

import com.bookmydriver.dto.PaymentDTO;
import java.util.List;

public interface PaymentService {
    List<PaymentDTO> getAllPayments();
    PaymentDTO getPaymentById(Long paymentId);
    PaymentDTO createPayment(PaymentDTO paymentDTO);
    PaymentDTO updatePayment(Long paymentId, PaymentDTO paymentDTO);
    void deletePayment(Long paymentId);
}
