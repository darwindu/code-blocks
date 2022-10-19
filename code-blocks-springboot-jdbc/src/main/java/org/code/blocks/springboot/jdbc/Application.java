package org.code.blocks.springboot.jdbc;


import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan
@MapperScan("org.code.blocks.springboot.jdbc.dao")
@Slf4j
public class Application {


	public static void main(String[] args) {
		SpringApplication.run(Application.class);
		log.info("#### start finished");
	}
}
