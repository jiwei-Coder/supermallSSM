package com.controller.Impl;

import com.controller.CartController;
import com.pojo.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/cart")
@CrossOrigin
public class CartControllerImpl implements CartController {

    @Autowired
    private HttpServletRequest httpServletRequest;

    @GetMapping("/data")
    public List<Goods> cartData() {
        String name = "";
        Cookie[] cookies = httpServletRequest.getCookies();
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("name")){
                name = cookie.getValue();
            }
        }

        List<Goods> goodsList = new ArrayList<Goods>();
        for (int i = 0; i < 3 ; i++) {
            Goods goods = new Goods();
            goods.setGoodsId(i);
            goods.setName(name);
            goods.setPrice(1000000000000.0+i);
            goodsList.add(goods);
        }
        return goodsList;
    }

    @PostMapping("/checkout")
    public Map<String, Object> checkout(@PathVariable String account ,@PathVariable double totalmoney) {
        Map<String,Object> map = new HashMap<String, Object>();

        map.put("totalmoney",100.0);
        map.put("account","张总");
        return map;
    }
}
