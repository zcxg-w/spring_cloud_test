package com.wy.spring_config_client;/**
 * @author wangyang on 2019/7/22.
 * @version 1.0
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *@program: eureka
 *@description: 查询配置信息
 *@author: wang yang
 *@create: 2019-07-22 15:43
 */
@RestController
public class QueryConfigController {

    @Value("${server.port}")
    private String port;


    @GetMapping("/configInfo")
    public String configInfo(){
        return port;
    }
}