package com.welch;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2018-3-15.
 */
public class ClassLoaderTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        ClassLoader classLoader = new MyClassLoader("C:\\tmp");
        Class clazz = classLoader.loadClass("com.welch.Test");
        if(clazz!=null){
            Object obj = clazz.newInstance();
            Method method = clazz.getDeclaredMethod("hello");
            method.invoke(obj);
        }
    }
}
