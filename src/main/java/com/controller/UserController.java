package com.controller;

import javax.servlet.http.HttpServletRequest;

public interface UserController {
    Boolean loginController(String account, String password, HttpServletRequest request);
    //    Boolean loginController();
    Boolean registerController(String account,String nickName,String password,String tel);
}
