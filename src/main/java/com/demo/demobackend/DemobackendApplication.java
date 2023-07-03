package com.demo.demobackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin
public class DemobackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemobackendApplication.class, args);
	}

}
