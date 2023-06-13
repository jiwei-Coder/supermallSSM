package com.service;

import com.pojo.User;

public interface UserService {
    User loginService(String account, String password);
    Boolean registerService(String account,String nickName,String password,String tel);
}
