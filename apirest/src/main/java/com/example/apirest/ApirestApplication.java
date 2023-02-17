package com.example.apirest;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import package1.package2.Message;
import java.util.Arrays;


@SpringBootApplication
public class ApirestApplication {

	public static void main(String[] args) {
        SpringApplication.run(ApirestApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(PersonRepository repository) {
        return args -> {
            repository.save(new Person("João","Silva"));
            repository.save(new Person("João","Silva"));
            repository.save(new Person("João","Silva"));
        };
    }

}
