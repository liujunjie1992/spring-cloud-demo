package me.junjieis.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class HelloController {

    @Value("${spring.application.name}")
    private String serverId;

    @Value("${server.port}")
    private int port;

    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
        InetAddress addr = null;
        try {
            addr = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        String socket = (null != addr ? addr.getHostAddress()  : serverId)+ ":" + port;
        return "Hello " + name + ", this is a message from " + socket;
    }
}
