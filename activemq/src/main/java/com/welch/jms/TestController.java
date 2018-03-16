package com.welch.jms;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Destination;

/**
 * Created by Administrator on 2018-3-16.
 */
@RestController
public class TestController {

    @Autowired
    private Producer1 producer;

    @RequestMapping("/test")
    public void test(){
        Destination destination = new ActiveMQQueue("mytest.queue");
        producer.sendMessage(destination, "Test msg from Welch");
    }
}
