package com.welch.dynamic;

import com.welch.Hello;
import com.welch.HelloImpl;

/**
 * Created by Administrator on 2018-3-15.
 */
public class Main {
    public static void main(String[] args){
        /*Hello hello = new HelloImpl();
        DynamicProxy dynamicProxy = new DynamicProxy(hello);
        Hello helloProxy = (Hello) Proxy.newProxyInstance(hello.getClass().getClassLoader(), hello.getClass().getInterfaces(), dynamicProxy);
        helloProxy.say("Welch");*/

        DynamicProxy dynamicProxy = new DynamicProxy(new HelloImpl());
        Hello helloProxy = dynamicProxy.getProxy();

        helloProxy.say("Jack");
    }
}
