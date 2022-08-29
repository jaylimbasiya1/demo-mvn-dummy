package com.example.demomvndummy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoMvnDummyApplication {

    public static void main(String[] args) {
        System.out.println("Maven Build Is Done");
        SpringApplication.run(DemoMvnDummyApplication.class, args);
    }

}
