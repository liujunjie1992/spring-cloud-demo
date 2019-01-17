package me.junjieis.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name= "spring-cloud-producer", fallback = HelloServiceHystrix.class)
public interface HelloService {
    @RequestMapping(value = "/hello")
    public String hello(@RequestParam(value = "name") String name);
}
