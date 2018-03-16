package com.welch;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2018-3-15.
 */
public class ContextClassLoaderTest {
    public static void main(String[] args)throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        ClassLoader classLoader = new MyClassLoader("C:\\tmp");
        Class clazz = classLoader.loadClass("com.welch.ISpeakTest");
        if(clazz!=null){
            Object obj = clazz.newInstance();
            Method method = clazz.getDeclaredMethod("hello");
            method.invoke(obj);
        }

        ClassLoader classLoader1 = new MyClassLoader("C:\\tmp\\child");
        System.out.println("Thread " + Thread.currentThread().getName() + " classloader: "+Thread.currentThread().getContextClassLoader().toString());

        new Thread(()->{
            Thread.currentThread().setContextClassLoader(classLoader1);
            System.out.println("Thread " + Thread.currentThread().getName() + " classloader: "+Thread.currentThread().getContextClassLoader().toString());
            ClassLoader classLoader2 = Thread.currentThread().getContextClassLoader();
            try {
                Class clazz2 = classLoader2.loadClass("com.welch.ISpeakTest");
                System.out.println(clazz2.getClassLoader().toString());
                if(clazz2!=null){
                    Object obj2 = null;
                    try {
                        obj2 = clazz2.newInstance();
                    } catch (InstantiationException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                    Method method = null;
                    try {
                        method = clazz2.getDeclaredMethod("hello");
                    } catch (NoSuchMethodException e) {
                        e.printStackTrace();
                    }
                    try {
                        method.invoke(obj2);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

        }).start();
    }
}
