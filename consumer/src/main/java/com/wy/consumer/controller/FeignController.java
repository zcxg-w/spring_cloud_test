package com.wy.consumer.controller;/**
 * @author wangyang on 2019/7/18.
 * @version 1.0
 */

import com.wy.service.IfeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: eureka
 * @description:
 * @author: wang yang
 * @create: 2019-07-18 14:24
 */
@RestController
public class FeignController {
    @Autowired
    IfeignService ifeignService;


    @GetMapping("/testget")
    public String test() {
        String str = ifeignService.testQuery();
        return str;
    }

    /**
     * 测试hystrix 熔断机制
     *
     * @param id
     * @return
     */
    @GetMapping("/testHystrix")
    public String testHystrix(@RequestParam(value = "id", required = false) String id) {
        String str = ifeignService.testHystrix(id);
        return str;
    }


}