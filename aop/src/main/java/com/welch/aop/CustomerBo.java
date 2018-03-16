package com.welch.aop;

/**
 * Created by Administrator on 2018-3-15.
 */
public interface CustomerBo {
    void addCustomer();

    String addCustomerReturnValue();

    void addCustomerThrowException() throws Exception;

    void addCustomerAround(String name);
}
