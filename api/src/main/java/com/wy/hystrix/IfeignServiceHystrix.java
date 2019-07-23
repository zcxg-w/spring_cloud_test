package com.wy.hystrix;/**
 * @author wangyang on 2019/7/19.
 * @version 1.0
 */

import com.wy.service.IfeignService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @program: eureka
 * @description: hystrix 熔断的接口
 * @author: wang yang
 * @create: 2019-07-19 13:33
 */

@Component
public class IfeignServiceHystrix implements FallbackFactory<IfeignService> {
    @Override
    public IfeignService create(Throwable throwable) {
        return new IfeignService() {
            @Override
            public String testQuery() {
                return "查询失败客户端降级";
            }

            @Override
            public String testHystrix(String id) {
                return "查询失败客户端降级" + id;
            }
        };
    }
}