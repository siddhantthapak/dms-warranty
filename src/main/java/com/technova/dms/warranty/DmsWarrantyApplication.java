package com.technova.dms.warranty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.technova.dms.warranty")
public class DmsWarrantyApplication {

	public static void main(String[] args) {
		SpringApplication.run(DmsWarrantyApplication.class, args);
	}

}
