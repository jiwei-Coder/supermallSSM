package com.controller;

import com.pojo.Category;
import com.pojo.Goods;

import java.util.List;

public interface HomeController {

    /**
     * get请求 /home/swipe
     * 获取首页轮播图数据
     * 获取当前热门的四个商品数据
     * @return
     */
    List<Goods> swiperList();

    /**
     * get请求 /home/recommendtype
     * 获取首页推荐商品类型
     * 获取当前最热门的四个商品类型（二级分类）
     * @return
     */
    List<Category> recommendtype();

    /**
     *
     * get  /home/data
     * 根据tip和页数获取首页商品数据（页数用于下拉加载更多）
     * 根据tip和页数获取一页（30个）商品数据
     * @param type
     * @param page
     * @return
     */
    List<Goods> loadData(String type,Integer page);

}
