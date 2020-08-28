package com.wance.serviceprovider.service;

import org.springframework.stereotype.Service;

@Service
public class ProviderService {
    public String sayHello(String name){
        return "你好, "+name;
    }
}
