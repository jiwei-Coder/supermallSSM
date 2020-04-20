package com.controller;

import com.pojo.Goods;

import java.util.List;
import java.util.Map;

public interface CartController {

    /**
     * get  /cart/data
     * 获取当前用户的所有购物车数据
     * @return
     */
    List<Goods> cartData();

    /**
     * get /cart/checkout
     * 结算所有勾选的商品数据
     * @return
     */
    Map<String, Object> checkout(String account , double totalmoney);

}
