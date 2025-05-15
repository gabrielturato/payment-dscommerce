package com.gturato.dscommerce.payment.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.gturato.dscommerce.payment.enums.PaymentMethod;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@JsonSerialize
public class PaymentDTO {

    @NotNull(message = "Campo Requerido")
    private PaymentMethod method;
    @Positive(message = "Id do pedido deve ser um numero positivo")
    private Long orderId;
}
