package com.example.service.server;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/service")
@SpringBootApplication
@EnableDiscoveryClient
public class ServiceServerApplication {
    private final Environment environment;

    public static void main(String[] args) {
        SpringApplication.run(ServiceServerApplication.class, args);
    }

    @RequestMapping
    public String test() {
        return "Hello world From Service Server - " + environment.getProperty("local.server.port");
    }
}
