package org.code.blocks.springcloud.eureka.article.controller;

import lombok.extern.slf4j.Slf4j;
import org.code.blocks.common.protocol.response.ResponseData;
import org.code.blocks.springcloud.eureka.article.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author darwindu
 * @date 2021/1/7
 **/
@RestController
@Slf4j
public class OrderController {

    //public static final String PAYMENT_URL = "http://EUREKA-CLIENT-USER-SERVICE";
    public static final String PAYMENT_URL = "http://localhost:8085";

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/consumer/payment/save")
    public ResponseData<Boolean> save(Payment payment){
        log.info("====== 请求插入：" + payment);
        return restTemplate.postForObject(PAYMENT_URL + "/payment/insert", payment, new ResponseData<Boolean>().getClass());
    }

    @GetMapping("/consumer/payment/get/{id}")
    public ResponseData<Payment> getPayment(@PathVariable("id") Long id){
        return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, new ResponseData<Payment>().getClass());
    }
}
