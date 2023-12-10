package com.example.CRUD_Operations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.repository")
public class CrudOperationsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudOperationsApplication.class, args);
    }

}
