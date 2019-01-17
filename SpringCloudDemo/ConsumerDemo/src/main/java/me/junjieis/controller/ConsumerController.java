package me.junjieis.controller;

import me.junjieis.service.HelloService;
import org.apache.commons.lang.math.NumberUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    private static final Logger LOG = LoggerFactory.getLogger(ConsumerController.class);

    @Autowired
    HelloService helloService;

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        LOG.info("name:{}, is number:{}", name, NumberUtils.isNumber(name));
        return helloService.hello(name);
    }

}
