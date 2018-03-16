package com.welch.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018-3-16.
 */
@RestController
@RequestMapping(value = "/welch")
public class RedisController {
    @RequestMapping(value = "/first", method = RequestMethod.GET)
    public Map<String, Object> firstResp (HttpServletRequest request){
        Map<String, Object> map = new HashMap<>();
        request.getSession().setAttribute("request Url", request.getRequestURL());
        map.put("request Url", request.getRequestURL());
        return map;
    }

    @RequestMapping(value = "/sessions", method = RequestMethod.GET)
    public Object sessions (HttpServletRequest request){
        Map<String, Object> map = new HashMap<>();
        map.put("sessionId", request.getSession().getId());
        map.put("message", request.getSession().getAttribute("request Url"));
        return map;
    }
}
