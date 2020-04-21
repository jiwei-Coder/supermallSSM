package com.service;

import com.pojo.Category;
import com.pojo.Goods;

import java.util.List;
import java.util.Map;

public interface HomeService {

    List<Goods> getSwiperData();

    List<Category> getRecommendType();

    List<Goods> loadData(Map searchMap);

}
