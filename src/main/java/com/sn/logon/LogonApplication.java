package com.sn.logon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.sn.logon.controller"})
@MapperScan("com.sn.logon.model")
public class LogonApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogonApplication.class, args);
	}
}
