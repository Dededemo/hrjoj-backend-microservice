package com.hrj.hrjojbackenduserservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.hrj.hrjojbackenduserservice.mapper")
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@ComponentScan("com.hrj")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.hrj.hrjojbackendserviceclient.service"})
public class HrjojBackendUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HrjojBackendUserServiceApplication.class, args);
    }

}
