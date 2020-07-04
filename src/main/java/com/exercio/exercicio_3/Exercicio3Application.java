package com.exercio.exercicio_3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;

@SpringBootApplication(scanBasePackages="com.exercio.exercicio_3")
@EntityScan(basePackages="com.exercio.exercicio_3.model")
public class Exercicio3Application {

	public static void main(String[] args) {
		SpringApplication.run(Exercicio3Application.class, args);
	}

}
