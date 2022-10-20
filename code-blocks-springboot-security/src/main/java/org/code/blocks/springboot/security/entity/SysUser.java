package org.code.blocks.springboot.security.entity;

import java.time.LocalDateTime;

import lombok.Data;

/**
 * @author darwindu
 * @date 2022/10/20
 **/
@Data
public class SysUser {

    private String userId;

    private String loginName;

    private String userName;

    private String password;

    private String valid;

    private String limitedIp;

    private LocalDateTime expiredTime;

    private LocalDateTime lastChangePwdTime;

    private String limitMultiLogin;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;
}
