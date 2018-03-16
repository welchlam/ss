package com.welch.cglib;

import com.welch.HelloImpl;

/**
 * Created by Administrator on 2018-3-15.
 */
public class Main {
    public static void main(String[] args){
        CGLibProxy cgLibProxy = CGLibProxy.getInstance();
        HelloImpl helloProxy = cgLibProxy.getProxy(HelloImpl.class);

        helloProxy.say("Jack");
    }
}
