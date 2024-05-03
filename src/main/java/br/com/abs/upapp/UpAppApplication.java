package br.com.abs.upapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories(basePackages = "br.com.abs.upapp")
public class UpAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(UpAppApplication.class, args);
	}

}
