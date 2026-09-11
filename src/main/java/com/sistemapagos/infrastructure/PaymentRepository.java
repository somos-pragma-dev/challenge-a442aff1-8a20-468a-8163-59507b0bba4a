package com.sistemapagos.infrastructure;

import com.sistemapagos.domain.PaymentDomain;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends ReactiveCrudRepository<PaymentDomain, UUID> {
}