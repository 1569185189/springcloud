package com.wance.consumerprovider.service;

import com.wance.consumerprovider.hystrix.MyHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

//本接口的实现，依赖于cloud名为service-provider的生产者
@FeignClient(value = "service-provider",fallback = MyHystrix.class)
public interface ConsumerService {
    @GetMapping("/hello")   //该方法通过访问生产者暴露的/hello，url来实现
    String sayHello(@RequestParam("name") String name);
}
