package com.example.elkkafkaserver1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ElkKafkaServer1Application {

    public static void main(String[] args) {
        SpringApplication.run(ElkKafkaServer1Application.class, args);
    }

}
