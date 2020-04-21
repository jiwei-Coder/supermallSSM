package com.controller.Impl;

import com.controller.HomeController;
import com.pojo.Category;
import com.pojo.Goods;
import com.service.HomeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/home")
@CrossOrigin
@Api(description = "首页接口")
public class HomeControllerImpl implements HomeController {

    @Autowired
    private HomeService homeService;

    @GetMapping("/login")
    public void Login(HttpServletResponse httpServletResponse){
        Cookie cookie = new Cookie("name","琛天皇");
        cookie.setPath("/");
        cookie.setMaxAge(60*10);
        httpServletResponse.addCookie(cookie);
    }

    @GetMapping("/swipe")
    @ApiOperation(value = "加载轮播图接口", notes = "加载轮播图接口" , httpMethod = "GET")
    public List<Goods> swiperList(){
        List<Goods> goodsList = homeService.getSwiperData();
        return goodsList;
    }

    @GetMapping("/recommendtype")
    @ApiOperation(value = "加载推荐类接口", notes = "加载推荐类接口" , httpMethod = "GET")
    public List<Category> recommendtype() {

        List<Category> categories = homeService.getRecommendType();
        return categories;
    }

    @PostMapping("/data")
    @ApiOperation(value = "根据tip和页数获取一页（30个）商品数据", notes = "根据tip和页数获取首页商品数据" , httpMethod = "POST")
    public List<Goods> loadData(@RequestBody Map searchMap) {
        List<Goods> goodsList = homeService.loadData(searchMap);
        System.out.println("type:"+searchMap.get("type"));
        System.out.println("page:"+searchMap.get("page"));
        return goodsList;
    }
}
