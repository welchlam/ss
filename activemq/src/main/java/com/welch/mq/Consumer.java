package com.welch.mq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018-3-16.
 */
@Component
public class Consumer {

    @JmsListener(destination = "sample.queue")
    public void receiveQueue(String text) {
        System.out.println("###############Message start#####################");
        System.out.println(text);
        System.out.println("###############Message end#####################");
    }
}
