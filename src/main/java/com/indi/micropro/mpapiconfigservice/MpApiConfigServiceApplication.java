package com.indi.micropro.mpapiconfigservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MpApiConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MpApiConfigServiceApplication.class, args);
	}

}
