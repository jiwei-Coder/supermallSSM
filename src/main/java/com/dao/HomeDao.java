package com.dao;

import com.pojo.Category;
import com.pojo.Goods;

import java.util.List;

public interface HomeDao {

    List<Goods> findHotGoods();

    List<Goods> findGoodsByTip(String tip);

    List<Category> findRecommendType();

}
