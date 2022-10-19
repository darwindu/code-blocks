package org.code.blocks.springboot.jdbc.protocol.vo;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

/**
 * @author darwindu
 * @date 2020/12/29
 **/
@Data
public class GirlVo {


    @NotEmpty(message = "cupSize不能为空")
    @Length(max = 1, message = "cupSize长度不能超过1")
    private String cupSize;

    @NotNull(message = "age不能为空")
    private Integer age;

}
