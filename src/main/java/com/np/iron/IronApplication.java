package com.np.iron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class IronApplication {

	public static void main(String[] args) {
		SpringApplication.run(IronApplication.class, args);
	}

}
