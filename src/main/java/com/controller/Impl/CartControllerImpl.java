package com.controller.Impl;

import com.controller.CartController;
import com.pojo.CartVo;
import com.pojo.Goods;
import com.service.CartService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/cart")
@CrossOrigin
@Api(description = "购物车接口")
public class CartControllerImpl implements CartController {

    @Autowired
    private HttpServletRequest httpServletRequest;

    @Autowired
    private CartService cartService;

    @GetMapping("/data")
    @ApiOperation(value = "加载用户购物车", notes = "加载用户购物车" , httpMethod = "GET")
    public List<CartVo> cartData() {
        String account = null;
        Cookie[] cookies = httpServletRequest.getCookies();
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("name")){
                account = cookie.getValue();
            }
        }

        List<CartVo> goodsList = cartService.getCartByUserAccount(account);
        return goodsList;
    }

    @PostMapping("/checkout")
    @ApiOperation(value = "用户购物车结算", notes = "用户结算" , httpMethod = "POST")
    public boolean checkout( @RequestBody Map searchMap) {
        return cartService.checkout(searchMap);
    }
}
