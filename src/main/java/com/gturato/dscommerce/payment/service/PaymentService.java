package com.gturato.dscommerce.payment.service;

import com.gturato.dscommerce.payment.dto.PaymentDTO;
import com.gturato.dscommerce.payment.message.PaymentProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    PaymentProducer producer;

    public void pay(PaymentDTO dto){
        producer.sendPayment(dto);
    }
}
