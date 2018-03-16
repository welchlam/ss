package com.welch;

/**
 * Created by Administrator on 2018-3-15.
 */
public class HelloImpl implements Hello {

    public void say(String name) {
        System.out.println(String.format("Hello %s !", name));
    }
}
