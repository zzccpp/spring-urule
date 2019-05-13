package cn.zcp.urule.service.impl;

import cn.zcp.urule.bean.User;
import cn.zcp.urule.dao.UserDao;
import cn.zcp.urule.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-02-09 23:23
 * @describe urule-project <描述>
 */
@Service
public class UserServiceImpl implements UserService {
    public UserServiceImpl() {
        System.out.println("UserServiceImpl初始化...");
    }

    @Resource
    private UserDao userDao;

    @Override
    public void insertUser(User user) {
        userDao.insertUser(user);
    }
}
