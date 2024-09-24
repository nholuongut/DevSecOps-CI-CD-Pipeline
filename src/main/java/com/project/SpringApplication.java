package com.project;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringApplication {

    public static Logger logger = LoggerFactory.getLogger(SpringApplication.class);

    @PostConstruct
    public void intt(){
        logger.info("Application Started...");
    }
    public static void main(String[] args) {
        logger.info("Application started..");
        org.springframework.boot.SpringApplication.run(SpringApplication.class, args);
    }
}