package com.example.llms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class LlmsApplication {
    public static void main(String[] args) {
        SpringApplication.run(LlmsApplication.class, args);
    }
}
