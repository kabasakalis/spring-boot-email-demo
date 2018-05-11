package com.kabasakalis.email;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmailLibraryApplication {

	public static void main(String[] args) {
    System.out.println("Library Loaded");
		SpringApplication.run(EmailLibraryApplication.class, args);
	}
}
