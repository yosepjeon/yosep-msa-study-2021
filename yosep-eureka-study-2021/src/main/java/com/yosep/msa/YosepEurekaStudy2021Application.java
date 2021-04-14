package com.yosep.msa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class YosepEurekaStudy2021Application {

	public static void main(String[] args) {
		SpringApplication.run(YosepEurekaStudy2021Application.class, args);
	}

}
