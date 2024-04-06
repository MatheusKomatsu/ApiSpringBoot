package br.com.camnuvem.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EntityScan(basePackages = {"br.com.camnuvem.api.model"})
@ComponentScan(basePackages = {"br.com.*"})
@EnableJpaRepositories(basePackages = {"br.com.camnuvem.api.repository"})
@EnableTransactionManagement // Gerência de transações
@EnableWebMvc // Habilitando os recursos de mvc
@RestController // Avisa ao spring que vamos trabalhar
@EnableAutoConfiguration // O spring já faz as manipulações


public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

}
