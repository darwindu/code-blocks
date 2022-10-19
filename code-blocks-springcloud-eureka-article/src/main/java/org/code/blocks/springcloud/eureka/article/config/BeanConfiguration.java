package org.code.blocks.springcloud.eureka.article.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author darwindu
 * @date 2020/12/22
 **/
@Configuration
public class BeanConfiguration {

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
