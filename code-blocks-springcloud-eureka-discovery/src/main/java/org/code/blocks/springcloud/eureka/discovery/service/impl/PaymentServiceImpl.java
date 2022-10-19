package org.code.blocks.springcloud.eureka.discovery.service.impl;

import org.code.blocks.common.errorcode.ErrorCode;
import org.code.blocks.common.protocol.response.ResponseData;
import org.code.blocks.springcloud.eureka.discovery.dao.PaymentDao;
import org.code.blocks.springcloud.eureka.discovery.entity.Payment;
import org.code.blocks.springcloud.eureka.discovery.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author darwindu
 * @date 2021/1/7
 **/
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public ResponseData<Boolean> save(String serial) {

        int index = paymentDao.save(serial);
        if (index > 0) {
            return ResponseData.success(true);
        }
        return ResponseData.fail(ErrorCode.MYBATIS_EXCEPTION);
    }

    @Override
    public ResponseData<Payment> getPaymentById(Long id) {
        Payment payment = paymentDao.getPaymentById(id);
        if (payment == null) {
            return ResponseData.fail(ErrorCode.RECORD_NOT_EXIST);
        }
        return ResponseData.success(payment);
    }
}
