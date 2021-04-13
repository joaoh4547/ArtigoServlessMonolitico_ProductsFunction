package com.app.serverless;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Flux;

import java.util.function.Function;

@SpringBootApplication
public class ServerlessApplication  extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(ServerlessApplication.class, args);
    }


}
