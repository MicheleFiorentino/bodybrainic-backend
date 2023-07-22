package com.mf.bodybrainic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class BodybrainicApplication {
	public static void main(String[] args) {
		SpringApplication.run(BodybrainicApplication.class, args);
	}

}
