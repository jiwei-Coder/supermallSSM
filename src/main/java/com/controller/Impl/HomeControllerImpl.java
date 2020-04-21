package com.controller.Impl;

import com.controller.HomeController;
import com.pojo.Category;
import com.pojo.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/home")
@CrossOrigin
public class HomeControllerImpl implements HomeController {

    @GetMapping("/login")
    public void Login(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        Cookie cookie = new Cookie("name","琛天皇");
        cookie.setPath("/");
        cookie.setMaxAge(60*10);
        httpServletResponse.addCookie(cookie);
    }

    @GetMapping("/swipe")
    public List<Goods> swiperList(){
        List<Goods> goodsList = new ArrayList<Goods>();
        for (int i = 0; i < 3 ; i++) {
            Goods goods = new Goods();
            goods.setGoodsId(i);
            goods.setName("买者必死"+i);
            goods.setPrice(1000000000000.0+i);
            goodsList.add(goods);
        }
        return goodsList;
    }

    @GetMapping("/recommendtype")
    public List<Category> recommendtype() {

        List<Category> categories = new ArrayList<Category>();
        for (int i = 0; i < 3 ; i++) {
            Category category = new Category();
            category.setBigCategoryId(i);
            category.setCategory("假货"+i);
            categories.add(category);
        }
        return categories;
    }

    @PostMapping("/data")
    public List<Goods> loadData(@RequestBody String type, @RequestBody Integer page) {
        List<Goods> goodsList = new ArrayList<Goods>();
        for (int i = 0; i < 3 ; i++) {
            Goods goods = new Goods();
            goods.setGoodsId(page);
            goods.setName(type);
            goods.setPrice(1000000000000.0+i);
            goodsList.add(goods);
        }
        return goodsList;
    }
}
