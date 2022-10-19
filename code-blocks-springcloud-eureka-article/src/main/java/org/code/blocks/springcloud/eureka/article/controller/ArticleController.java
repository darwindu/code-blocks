package org.code.blocks.springcloud.eureka.article.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author darwindu
 * @date 2020/12/22
 **/
@RestController
public class ArticleController {

    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/article/callHello")
    public String callHello() {
        return restTemplate.getForObject("http://localhost:8085/user/hello", String.class);
    }
}
