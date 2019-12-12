package com.microservice.stock.sector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SectorApplication {

    public static void main(String[] args) {
        SpringApplication.run(SectorApplication.class, args);
    }

}
