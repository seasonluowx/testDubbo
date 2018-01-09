package com.xiaoyi.testDubbo.service;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Reference
    public TestDemo testDemo;

    public void sayHello(){
        System.out.println(testDemo.sayHello());
    }

}
