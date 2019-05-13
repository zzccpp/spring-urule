package cn.zcp.urule.service.impl;

import cn.zcp.urule.bean.Customer;
import cn.zcp.urule.service.UruleActionDemo;
import com.bstek.urule.model.ExposeAction;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-02-10 19:49
 * @describe urule-project <描述>
 */
@Service
public class UruleActionDemoImpl implements UruleActionDemo {


    @ExposeAction("方法1")
    @Override
    public boolean methodOne(String userName) {
        if(StringUtils.isBlank(userName)){
            return false;
        }
        if("王五".equals(userName)){
            return true;
        }
        return false;
    }
    @ExposeAction("方法2")
    @Override
    public int methodTwo(int a, int b) {
        return a+b;
    }

    @ExposeAction("方法三")
    @Override
    public void methodThree(String userName, Date birthDay) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if(null!=birthDay){
            String day = sdf.format(birthDay);
            System.out.println(userName+"今年已经"+day+"岁了!");
        }else{
            System.out.println("hello "+userName);
        }
    }
    @ExposeAction("打印Customer")
    @Override
    public void printUser(Customer customer) {
        System.out.println("Hello "+customer.getName()+", has house:"+customer.isHouse());
    }
}
