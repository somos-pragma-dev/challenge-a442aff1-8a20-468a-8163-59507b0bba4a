package com.sistemapagos;

import com.sistemapagos.application.PaymentService;
import com.sistemapagos.domain.PaymentDomain;
import com.sistemapagos.infrastructure.PaymentRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
class PaymentServiceTest {

    @Autowired
    private PaymentService paymentService;

    @MockBean
    private PaymentRepository paymentRepository;

    @Test
    void testProcessPayment() {
        PaymentDomain payment = new PaymentDomain();
        Mockito.when(paymentRepository.save(payment)).thenReturn(Mono.just(payment));

        StepVerifier.create(paymentService.processPayment(payment))
               .expectNext(payment)
               .verifyComplete();
    }
}