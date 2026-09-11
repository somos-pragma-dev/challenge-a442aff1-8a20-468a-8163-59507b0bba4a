package com.sistemapagos.infrastructure;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class PaymentIntegrationClient {

    private final WebClient webClient;

    public PaymentIntegrationClient(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.build();
    }

    public Mono<String> callExternalService() {
        return webClient.get()
               .uri("http://external-service/payments")
               .retrieve()
               .bodyToMono(String.class);
    }
}