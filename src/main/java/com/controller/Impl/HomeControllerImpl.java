package com.controller.Impl;

import com.controller.HomeController;
import com.pojo.Goods;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/home")
@CrossOrigin
public class HomeControllerImpl implements HomeController {

    @GetMapping("/swipe")
    public List<Goods> swiperList() {
        return null;
    }

    @GetMapping("/recommendtype")
    public List<Goods> recommendtype() {
        return null;
    }

    @GetMapping("/data")
    public List<Goods> loadData(String type, Integer page) {
        return null;
    }
}
