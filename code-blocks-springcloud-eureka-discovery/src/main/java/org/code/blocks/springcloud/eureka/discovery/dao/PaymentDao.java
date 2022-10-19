package org.code.blocks.springcloud.eureka.discovery.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.code.blocks.springcloud.eureka.discovery.entity.Payment;

/**
 * @author darwindu
 * @date 2021/1/7
 **/
@Mapper
public interface PaymentDao {

    int save(@Param("serial")String serial);

    Payment getPaymentById(@Param("id") Long id);
}
