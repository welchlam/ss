package com.welch.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 * Created by Administrator on 2018-3-17.
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public Map firstService() {
        return restTemplate.getForObject("http://SERVICE-HI/welch/first", Map.class);
    }

    public Map sessionService() {
        return restTemplate.getForObject("http://SERVICE-HI/welch/sessions", Map.class);
    }
}
