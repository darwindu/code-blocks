package org.code.blocks.springcloud.eureka.discovery;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * Eureka编写服务提供者
 * @author darwindu
 * @date 2020/12/17
 **/
@SpringBootApplication
@EnableDiscoveryClient
@Slf4j
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
        log.info("#### start springcloud eureka discoery finished");
    }
}
