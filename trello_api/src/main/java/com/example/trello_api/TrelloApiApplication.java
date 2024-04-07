package com.example.trello_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

public class TrelloApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrelloApiApplication.class, args);
    }
}
