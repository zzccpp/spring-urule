package cn.zcp.urule.service;

import cn.zcp.urule.bean.Customer;

import java.util.Date;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-02-10 19:44
 * @describe urule-project <描述>
 */
public interface UruleActionDemo {

    boolean methodOne(String userName);
    int methodTwo(int a,int b);
    void methodThree(String userName, Date birthDay);
    void printUser(Customer customer);
}
