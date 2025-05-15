package com.gturato.dscommerce.payment.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.gturato.dscommerce.payment.enums.PaymentMethod;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
@JsonSerialize
public class PaymentProducerDTO {

    private Instant moment;
    private PaymentMethod method;
    private Long orderId;
}
