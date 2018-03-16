package com.welch.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2018-3-15.
 */
public class App {
    public static void main(String[] args) throws Exception {

        ApplicationContext appContext = new ClassPathXmlApplicationContext("Spring-Customer.xml");

        CustomerBo customer = (CustomerBo) appContext.getBean("customerBo");
        customer.addCustomer();

        //customer.addCustomerReturnValue();

        //customer.addCustomerThrowException();

        //customer.addCustomerAround("mkyong");

    }
}