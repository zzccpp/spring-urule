package cn.zcp.urule.dao;

import cn.zcp.urule.bean.User;
import org.springframework.stereotype.Service;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-02-09 23:20
 * @describe urule-project <描述>
 */
@Service
public class UserDao {

    public UserDao() {
        System.out.println("UserDao初始化...");
    }

    public void insertUser(User user){

        System.out.println("添加user成功!");
    }

}
