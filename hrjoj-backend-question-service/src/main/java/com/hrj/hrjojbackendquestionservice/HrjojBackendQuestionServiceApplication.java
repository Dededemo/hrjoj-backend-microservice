package com.hrj.hrjojbackendquestionservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.hrj.hrjojbackendquestionservice.mapper")
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@ComponentScan("com.hrj")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.hrj.hrjojbackendserviceclient.service"})
public class HrjojBackendQuestionServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HrjojBackendQuestionServiceApplication.class, args);
    }

}
