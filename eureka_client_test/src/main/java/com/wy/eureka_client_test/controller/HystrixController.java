package com.wy.eureka_client_test.controller;/**
 * @author wangyang on 2019/7/19.
 * @version 1.0
 */

import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * @program: eureka
 * @description:
 * @author: wang yang
 * @create: 2019-07-19 13:21
 */
@RestController
public class HystrixController {


    @GetMapping("/testHystrix")
    public String testHystrix(@RequestParam(value = "id",required = false) String id) {
        if (StringUtils.isEmpty(id)) {
            throw new RuntimeException("");
        } else {
            return "hello world";
        }
    }
}