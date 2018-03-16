package com.welch;

/**
 * Created by Administrator on 2018-3-15.
 */
public class Main {
    public static void main(String[] args){
        System.out.println(System.getProperty("sun.boot.class.path"));
        System.out.println(System.getProperty("java.ext.dirs"));
        System.out.println(System.getProperty("java.class.path"));

        ClassLoader cl = Main.class.getClassLoader();
        System.out.println(cl);
        System.out.println(cl.getParent());
        System.out.println(cl.getParent().getParent());
        System.out.println(String.class.getClassLoader());
        //sun.misc.Launcher
    }
}
