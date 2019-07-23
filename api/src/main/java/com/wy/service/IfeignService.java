package com.wy.service;/**
 * @author wangyang on 2019/7/18.
 * @version 1.0
 */

import com.wy.hystrix.IfeignServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @program: eureka
 * @description:
 * @author: wang yang
 * @create: 2019-07-18 14:16
 */
//                                        下面 添加熔断返回信息
@FeignClient(value = "SERVICE-HI",fallbackFactory = IfeignServiceHystrix.class)
public interface IfeignService {

    @GetMapping("/testQuery")
    public String testQuery();

    @GetMapping("/testHystrix")
    public String testHystrix(@RequestParam(value = "id",required = false)  String id);
}