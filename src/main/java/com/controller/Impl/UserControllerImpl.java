package com.controller.Impl;

import com.controller.UserController;
import com.pojo.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/profile")
public class UserControllerImpl implements UserController {
    @Autowired
    private UserService userService;
    private HttpSession session;

    @Override
    @GetMapping("/register")
    @ResponseBody
    public Boolean registerController(String account, String nickName, String password, String tel) {
        return userService.registerService(account,nickName,password,tel);
    }

    @Override
    @GetMapping("/login")
    @ResponseBody
    public Boolean loginController(String account, String password, HttpServletRequest request) {
        System.out.println("account=" + account);
        System.out.println("password=" + password);
        HttpSession session=request.getSession();
        if(userService.loginService(account,password)==null)
            return false;
        else
        {

            session.setAttribute("user",(User)userService.loginService(account,password));
            System.out.println(session.getAttribute("user"));
//            System.out.println((User)userService.loginService(account, password));
            return true;
        }

    }
}
