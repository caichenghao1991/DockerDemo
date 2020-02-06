package com.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerDemoApplication {
	//docker pull caichenghao/docker-demo
	//docker run -p 8080:8080 -d caichenghao/docker-demo:latest
	// docker: http://192.168.99.100:8080/calculator/add?a=1&b=2
	//localhost/calculator/add?a=1&b=2
	public static void main(String[] args) {
		SpringApplication.run(DockerDemoApplication.class, args);
	}

}
