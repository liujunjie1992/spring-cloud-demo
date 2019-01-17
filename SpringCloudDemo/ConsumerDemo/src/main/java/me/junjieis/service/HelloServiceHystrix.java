package me.junjieis.service;


import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class HelloServiceHystrix implements HelloService {
    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "hello " + name + ", this messge send failed ";
    }
}
