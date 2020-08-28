package com.wance.serviceprovider;

import com.wance.serviceprovider.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController //cloud需要用url接口对外提供服务-->需要控制器
@EnableEurekaClient //以客户端方式连接到eureka注册中心
public class ServiceProviderApplication {

    @Autowired
    private ProviderService service;

    @Value("${server.port}")    //从环境变量读取值
    private int port;
    public static void main(String[] args) {
        SpringApplication.run(ServiceProviderApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello(String name){
        return service.sayHello(name)+", 生产者端口："+port;
    }
}
