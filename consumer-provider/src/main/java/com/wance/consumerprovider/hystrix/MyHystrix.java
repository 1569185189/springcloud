package com.wance.consumerprovider.hystrix;

import com.wance.consumerprovider.service.ConsumerService;
import org.springframework.stereotype.Component;

//自定义断路器，代替生产者提供默认响应。
@Component
public class MyHystrix implements ConsumerService {
    @Override
    public String sayHello(String name) {
        return "sorry "+name+"访问生产者失败";
    }
}
