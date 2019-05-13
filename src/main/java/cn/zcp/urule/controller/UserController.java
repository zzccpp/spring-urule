package cn.zcp.urule.controller;

import cn.zcp.urule.bean.User;
import cn.zcp.urule.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-02-10 10:13
 * @describe urule-project <描述>
 */
@Controller
public class UserController {

    public UserController() {
        System.out.println("UserController初始化...");
    }

    @Resource
    private UserService userServiceImpl;

    @RequestMapping("/userAdd")
    public String addUser(String userName,String passWord){

        System.out.println("userName = [" + userName + "], passWord = [" + passWord + "]");
        User user = new User();
        user.setUserName(userName);
        user.setPassWord(passWord);
        userServiceImpl.insertUser(user);
        return "success";
    }
}
