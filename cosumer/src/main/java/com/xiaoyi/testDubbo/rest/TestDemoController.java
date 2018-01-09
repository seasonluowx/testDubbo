package com.xiaoyi.testDubbo.rest;

import com.xiaoyi.testDubbo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestDemoController {
    @Autowired
    private TestService testService;

    @GetMapping("/test")
    public void sayHello(){
        System.out.println("start....");
        testService.sayHello();
    }
}
