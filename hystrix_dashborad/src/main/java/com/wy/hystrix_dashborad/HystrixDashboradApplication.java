package com.wy.hystrix_dashborad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboradApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboradApplication.class, args);
    }

}
