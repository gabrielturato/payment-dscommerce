package com.gturato.dscommerce.payment.controller;

import com.gturato.dscommerce.payment.dto.PaymentDTO;
import com.gturato.dscommerce.payment.service.PaymentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
@RequestMapping(value = "/payments")
public class PaymentController {

    @Autowired
    PaymentService service;

    @PostMapping
    ResponseEntity<Void> pay(@RequestBody @Valid PaymentDTO dto){
        service.pay(dto);
        return ResponseEntity.noContent().build();
    }
}
