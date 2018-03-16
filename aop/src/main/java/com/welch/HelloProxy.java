package com.welch;

/**
 * Created by Administrator on 2018-3-15.
 */
public class HelloProxy implements Hello{
    private Hello hello;

    public HelloProxy(){
        this.hello = new HelloImpl();
    }

    public void say(String name) {
        this.before();
        this.hello.say(name);
        this.after();
    }

    private void before(){
        System.out.println("Before");
    }

    private void after(){
        System.out.println("After");
    }
}
