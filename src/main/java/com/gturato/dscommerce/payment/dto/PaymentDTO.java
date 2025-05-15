package com.gturato.dscommerce.payment.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
@JsonSerialize
public class PaymentDTO {

    private Long id;
    private Instant moment;
    private Long orderId;
}
