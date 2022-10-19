package org.code.blocks.springcloud.eureka.discovery.service;


import org.code.blocks.common.protocol.response.ResponseData;
import org.code.blocks.springcloud.eureka.discovery.entity.Payment;

/**
 * @author darwindu
 * @date 2021/1/7
 **/
public interface PaymentService {

    ResponseData<Boolean> save(String serial);

    ResponseData<Payment> getPaymentById(Long id);
}
