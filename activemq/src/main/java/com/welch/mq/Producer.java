package com.welch.mq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Queue;

/**
 * Created by Administrator on 2018-3-16.
 */
@RestController
public class Producer {
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    private Queue queue;

    @RequestMapping("/sendMsg")
    public String send() {
        this.jmsMessagingTemplate.convertAndSend(this.queue, "Welch");
        return "Message sent successfully!";
    }
}
