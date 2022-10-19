package org.code.blocks.springcloud.eureka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * Eureka注册中心
 * @author darwindu
 * @date 2020/12/17
 **/
@EnableEurekaServer
@SpringBootApplication
@Slf4j
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
        log.info("#### start springcloud eukera finished");
    }
}
