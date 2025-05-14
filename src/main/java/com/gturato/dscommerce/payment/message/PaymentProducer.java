package com.gturato.dscommerce.payment.message;

import com.gturato.dscommerce.payment.dto.PaymentDTO;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class PaymentProducer {

    @Autowired
    private KafkaTemplate<String, PaymentDTO> kafkaTemplate;

    @Value("${kafka.topic.name}")
    private String topicName;

    public void sendPayment(PaymentDTO paymentDTO) {
        kafkaTemplate.send(topicName, paymentDTO);
    }

}
