package org.code.blocks.springboot.jdbc.runner;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * 启动之后初始化
 * @author darwindu
 * @date 2019/4/29
 **/
@Component
@Slf4j
public class CommonRunner implements CommandLineRunner {


	@Override
	public void run(String... args) throws Exception {
		
		log.info("++++++++++runner start");
		log.info("++++++++++runner end");
	}
}
