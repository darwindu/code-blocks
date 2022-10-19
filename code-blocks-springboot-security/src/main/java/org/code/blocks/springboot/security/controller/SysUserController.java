package org.code.blocks.springboot.security.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
public class SysUserController {

    @RequestMapping("/list")
    public String index() {
        return "list";
    }



    @RequestMapping("/whoim")
    public Object whoIm() {
        log.info("### whoim come on...");
        return SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }


}
