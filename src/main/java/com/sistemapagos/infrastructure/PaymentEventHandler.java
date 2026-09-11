package com.sistemapagos.infrastructure;

import com.sistemapagos.domain.PaymentDomain;
import org.springframework.stereotype.Component;

@Component
public class PaymentEventHandler {

    public void handlePaymentEvent(PaymentDomain payment) {
        // Lógica para manejar el evento de pago
    }
}