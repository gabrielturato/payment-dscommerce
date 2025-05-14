package com.gturato.dscommerce.payment.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.Instant;

@Getter
@AllArgsConstructor
public class PaymentDTO {

    private Long id;
    private Instant moment;
}
