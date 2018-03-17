package com.welch.controller;

import com.welch.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by Administrator on 2018-3-17.
 */
@RestController
public class HelloControler {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/first")
    public Map first(){
        return helloService.firstService();
    }

    @RequestMapping(value = "/session")
    public Map session(){
        return helloService.sessionService();
    }
}