package com.gturato.dscommerce.payment.controller;

import com.gturato.dscommerce.payment.dto.PaymentDTO;
import com.gturato.dscommerce.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/payments")
public class PaymentController {

    @Autowired
    PaymentService service;

    @PostMapping
    ResponseEntity<Void> pay(@RequestBody PaymentDTO dto){
        //service.pay(dto);
        return ResponseEntity.noContent().build();
    }
}
