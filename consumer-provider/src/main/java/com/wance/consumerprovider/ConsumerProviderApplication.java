package com.wance.consumerprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@RestController //消费者也是控制器
@EnableEurekaClient //可以连接注册中心
@EnableDiscoveryClient  //具有注册中心拉取的能力
@EnableFeignClients     //以feign客户端身份访问Feign服务器
public class ConsumerProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerProviderApplication.class, args);
    }

}
