package org.code.blocks.springboot.security.config;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
import org.springframework.security.web.savedrequest.RequestCache;
import org.springframework.security.web.savedrequest.SavedRequest;
import org.springframework.stereotype.Component;

/**
 * 登录成功处理
 */
@Component
public class MyAuthenticationSucessHandler implements AuthenticationSuccessHandler {
    private RequestCache requestCache = new HttpSessionRequestCache();
    private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
                                        Authentication authentication) throws IOException, ServletException {
        //response.setContentType("application/json;charset=utf-8");
        //response.getWriter().write(objectMapper.writeValueAsString(authentication));
        SavedRequest savedRequest = requestCache.getRequest(request, response);
        if (savedRequest == null){
            redirectStrategy.sendRedirect(request, response, "/index");
        }else {
            System.out.println(savedRequest.getRedirectUrl());
            redirectStrategy.sendRedirect(request, response, savedRequest.getRedirectUrl());
        }

    }
}