package com.gturato.dscommerce.payment.service;

import com.gturato.dscommerce.payment.dto.PaymentDTO;
import com.gturato.dscommerce.payment.dto.PaymentProducerDTO;
import com.gturato.dscommerce.payment.message.PaymentProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class PaymentService {

    @Autowired
    PaymentProducer producer;

    public void pay(PaymentDTO dto){
        PaymentProducerDTO message = new PaymentProducerDTO();
        message.setMoment(Instant.now());
        message.setMethod(dto.getMethod());
        message.setOrderId(dto.getOrderId());
        producer.sendPayment(dto);
    }
}
