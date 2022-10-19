package org.code.blocks.springboot.security;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Eureka编写服务提供者
 * @author darwindu
 * @date 2020/12/17
 **/
@SpringBootApplication
@Slf4j
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
        log.info("#### start springboot security finished");
    }
}
