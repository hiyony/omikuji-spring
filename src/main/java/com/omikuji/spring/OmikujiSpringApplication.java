package com.omikuji.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class OmikujiSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(OmikujiSpringApplication.class, args);
	}

}
