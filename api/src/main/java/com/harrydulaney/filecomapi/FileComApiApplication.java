package com.harrydulaney.filecomapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
public class FileComApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(FileComApiApplication.class, args);
    }

}
