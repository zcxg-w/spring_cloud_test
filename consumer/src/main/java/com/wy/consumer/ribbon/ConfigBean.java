package com.wy.consumer.ribbon;/**
 * @author wangyang on 2019/7/16.
 * @version 1.0
 */

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @program: springcloud1
 * @description:
 * @author: wang yang
 * @create: 2019-07-16 15:59
 */
@Configuration
public class ConfigBean {

    @Bean
    //spring cloud Ribbon是基于Netflix Ribbon实现的一套客户端 负载均衡的工具(默认轮询)
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Bean
    //修改Ribbon的负载均衡算法
    public IRule myRule() {
        return new RetryRule();
    }

}