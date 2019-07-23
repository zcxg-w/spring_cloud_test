package com.wy.eureka_client_test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@SpringBootApplication
@RestController

//@EnableHystrix
@EnableCircuitBreaker//对hystrix熔断机制的支持
public class EurekaClientTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientTestApplication.class, args);
    }

    @Value("${server.port}")
    String port;

    @GetMapping("/hi")
    @Override
    public String toString() {
        return "这是端口为：" + port + "实例项目";
    }

}
