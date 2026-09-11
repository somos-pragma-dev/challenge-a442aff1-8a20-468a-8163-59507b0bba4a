package com.sistemapagos.application;

import com.sistemapagos.domain.PaymentDomain;
import com.sistemapagos.infrastructure.PaymentRepository;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    private final PaymentRepository paymentRepository;

    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public PaymentDomain processPayment(PaymentDomain payment) {
        // Lógica de negocio
        return paymentRepository.save(payment);
    }
}