package org.code.blocks.springcloud.eureka.discovery.controller;

import javax.validation.Valid;

import lombok.extern.slf4j.Slf4j;
import org.code.blocks.common.protocol.response.ResponseData;
import org.code.blocks.springcloud.eureka.discovery.entity.Payment;
import org.code.blocks.springcloud.eureka.discovery.service.PaymentService;
import org.code.blocks.springcloud.eureka.discovery.vo.PaymentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author darwindu
 * @date 2021/1/7
 **/
@Slf4j
@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/payment/save")
    public ResponseData<Boolean> save(@RequestBody @Valid PaymentVo paymentVo) {
        return paymentService.save(paymentVo.getSerial());
    }

    @GetMapping("/payment/get/{id}")
    public ResponseData<Payment> getPaymentById(@PathVariable("id") Long id) {
        return paymentService.getPaymentById(id);
    }
}
