package org.code.blocks.springcloud.eureka.discovery.vo;

import javax.validation.constraints.NotEmpty;

import lombok.Data;

/**
 * @author darwindu
 * @date 2021/1/7
 **/
@Data
public class PaymentVo {

    @NotEmpty(message = "serial不能为空")
    private String serial;
}
