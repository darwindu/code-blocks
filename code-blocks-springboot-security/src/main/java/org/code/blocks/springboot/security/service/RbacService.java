package org.code.blocks.springboot.security.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.Authentication;

/**
 * @author darwindu
 * @date 2020/12/24
 **/
public interface RbacService {

    boolean hasPermission(HttpServletRequest request, Authentication authentication);
}
