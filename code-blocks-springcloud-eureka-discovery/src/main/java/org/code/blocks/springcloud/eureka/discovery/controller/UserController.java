package org.code.blocks.springcloud.eureka.discovery.controller;

import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author darwindu
 * @date 2020/12/22
 **/
@RestController
public class UserController {

    @GetMapping("/user/hello")
    public String hello() {
        return "hello";
    }

    @Autowired
    private EurekaClient eurekaClient;

    @GetMapping("/article/infos")
    public Object serviceUrl() {
        return eurekaClient.getInstancesByVipAddress( "eureka-client-user-service", false);
    }
}
