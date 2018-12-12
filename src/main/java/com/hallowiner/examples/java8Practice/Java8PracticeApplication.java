package com.hallowiner.examples.java8Practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Java8PracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(Java8PracticeApplication.class, args);



		new Thread(()  -> System.out.println("Hola Mundo!")).start();
	}
}
