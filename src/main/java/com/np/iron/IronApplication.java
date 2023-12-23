package com.np.iron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableJpaAuditing
@EnableDiscoveryClient
@RestController
public class IronApplication {

	public static void main(String[] args) {
		SpringApplication.run(IronApplication.class, args);
	}

	@RequestMapping("/")
	public String home() {
		return "this is  iron's rms-server in nut's ground";
	}
}
