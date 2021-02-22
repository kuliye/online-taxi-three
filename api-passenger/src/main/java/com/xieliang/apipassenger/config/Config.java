package com.xieliang.apipassenger.config;


import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Config {
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }
}
// 出现错误 Consider defining a bean of type 'org.springframework.web.client.RestTemplate' in your configuration.
// 原因    Spring Boot<=1.3 无需定义，Spring Boot自动了一个。
//        Spring Boot >= 1.4 Spring Boot不再自动定义一个RestTemplate，而是定义了一个RestTemplateBuilder允许您更好地控制所RestTemplate创建的对象
//        定义RestTemplate Bean即可完成注入