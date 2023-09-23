package com.example.authserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 Spring authorization server doc: https://docs.spring.io/spring-authorization-server/reference/index.html
 What is PKCE? https://www.youtube.com/watch?v=h_1JAh3JPkI
 Why we need state in authorization request?
 */
@SpringBootApplication
public class AuthServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthServerApplication.class, args);
	}

}

