package com.xiaoyi.testDubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.xiaoyi.testDubbo.service.TestDemo;

@Service(timeout = 5000)
public class TestDemoImpl implements TestDemo {

    @Override
    public String sayHello() {
        return "hello world";
    }
}
