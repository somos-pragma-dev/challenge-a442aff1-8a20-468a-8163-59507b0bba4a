package com.sistemapagos.application;

import com.sistemapagos.domain.PaymentDomain;
import com.sistemapagos.infrastructure.PaymentRepository;
import org.springframework.stereotype.Service;

@Service
public class PaymentQueryService {
    private final PaymentRepository paymentRepository;

    public PaymentQueryService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public Mono<PaymentDomain> getPaymentById(UUID paymentId) {
        return paymentRepository.findById(paymentId);
    }
}