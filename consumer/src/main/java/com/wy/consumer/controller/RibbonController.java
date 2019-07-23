package com.wy.consumer.controller;/**
 * @author wangyang on 2019/7/16.
 * @version 1.0
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @program: springcloud1
 * @description:
 * @author: wang yang
 * @create: 2019-07-16 16:06
 */
@RestController
public class RibbonController {
    private static final String SERVER_NAME = "http://SERVICE-HI";

  /*  @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/testget")
    public String test() {
        ResponseEntity<String> str = restTemplate.getForEntity(SERVER_NAME + "/testQuery", String.class);
        System.out.println(str);
        return str.getBody();
    }
*/
}