package com.gturato.dscommerce.payment.message;

import com.gturato.dscommerce.payment.dto.PaymentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class PaymentProducer {

    @Autowired
    private final KafkaTemplate<String, PaymentDTO> kafkaTemplate;

    @Value("${kafka.topic.name}")
    private String topicName;

    public PaymentProducer(KafkaTemplate<String, PaymentDTO> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendPayment(PaymentDTO paymentDTO) {
        kafkaTemplate.send(topicName, paymentDTO);
    }

}
