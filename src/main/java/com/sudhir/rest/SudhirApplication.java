package com.sudhir.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.sudhir")
public class SudhirApplication {

	public static void main(String[] args) {
		SpringApplication.run(SudhirApplication.class, args);
	}

}



