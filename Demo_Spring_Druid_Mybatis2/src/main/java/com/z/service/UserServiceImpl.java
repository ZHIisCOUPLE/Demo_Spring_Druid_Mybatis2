package com.z.service;

import com.z.dao.UserDao;
import com.z.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Override
    public String getUser(String userName, String password) {
        User user = userDao.getUser(userName, password);
        if (user != null){
            return "登陆成功";
        }
        return "登陆失败";
    }
}
