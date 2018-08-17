package com.proman.web.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestApplication implements CommandLineRunner {
 
    @Autowired
    private AppConfiguration configuration;
 
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(RestApplication.class);
        app.run();
    }
 
    public void run(String... args) throws Exception {
    	// DBMigrationAssistant.init();
        System.out.println("using environment: " + configuration.getName());
        System.out.println("name: " + configuration.getName());
        System.out.println("servers: " + configuration.getUrl());
    }
}