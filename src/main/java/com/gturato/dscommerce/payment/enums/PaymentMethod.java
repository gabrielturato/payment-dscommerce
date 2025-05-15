package com.gturato.dscommerce.payment.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Getter;

@Getter
public enum PaymentMethod {
    DEBIT_CARD("DC"),CREDIT_CARD("CC"),CASH("CA"),TICKET("TI");

    private String code;

    PaymentMethod(String code) {
        this.code = code;
    }

    @JsonCreator
    public static PaymentMethod fromCode(String codigo) {
        for (PaymentMethod paymentMethod : PaymentMethod.values()) {
            if (paymentMethod.getCode().equalsIgnoreCase(codigo)) {
                return paymentMethod;
            }
        }
        throw new IllegalArgumentException("Código de status inválido: " + codigo);
    }
}
