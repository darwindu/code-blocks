package org.code.blocks.springboot.jdbc.protocol.vo;

import javax.validation.constraints.NotNull;

import lombok.Data;

/**
 * @author darwindu
 * @date 2020/12/29
 **/
@Data
public class GirlIdVo {

    @NotNull(message = "id不能为空")
    private Integer id;
}
