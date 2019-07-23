package com.wy.eureka_client_test.controller;/**
 * @author wangyang on 2019/7/17.
 * @version 1.0
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: eurka-service
 * @description:
 * @author: wang yang
 * @create: 2019-07-17 16:10
 */
@RestController
public class ServerController {


    @GetMapping("/testQuery")
    public String testQuery() {
        return "hello world + 4";
    }
}