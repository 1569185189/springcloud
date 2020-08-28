package com.wance.consumerprovider.action;

import com.wance.consumerprovider.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //消费者也是控制器
public class ConsumerAction {
    @Autowired
    private ConsumerService service;
    @GetMapping("/myhello")
    public String myHello(String name){
        return service.sayHello(name);
    }
}
