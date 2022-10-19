package org.code.blocks.springboot.security.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author darwindu
 * @date 2020/12/23
 **/
@Slf4j
@Controller
public class IndexController {

    /**
     * 跳转首页
     */
    @GetMapping("")
    public void home(HttpServletResponse response){
        //内部重定向
        try {
            response.sendRedirect("/index");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 首页
     */
    @RequestMapping("/index")
    @ResponseBody
    public String index() {
        return "index，首页";
    }


    @RequestMapping("/loginPage")
    public String login() {
        log.info("### 进入loginPage");
        return "login_page";
    }

    @RequestMapping("/form")
    public void form(HttpServletRequest request,HttpServletResponse response) {
        //内部重定向
        try {
            response.sendRedirect("/index");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @RequestMapping("/loginError")
    @ResponseBody
    public String loginError() {
        return "loginError,失败页面";
    }
}
