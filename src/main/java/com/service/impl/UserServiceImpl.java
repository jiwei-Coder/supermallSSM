package com.service.impl;

import com.dao.UserDao;
import com.pojo.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public User loginService(String account, String password) {
        if(userDao.login(account,password)!=null)
            return userDao.login(account,password);
        else
            return null;
    }

    @Override
    public Boolean registerService(String account,String nickName,String password,String tel) {
        if(userDao.register(account,nickName,password,tel)==1)
        {

            return true;
        }

        else
            return false;
    }
}
