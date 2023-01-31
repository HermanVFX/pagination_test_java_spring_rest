package com.example.pagination_test_java_spring_rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class PaginationTestJavaSpringRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(PaginationTestJavaSpringRestApplication.class, args);
    }

}
