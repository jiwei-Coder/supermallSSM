package com.controller;

import com.pojo.Cart;
import com.pojo.CartVo;
import com.pojo.Goods;

import java.util.List;
import java.util.Map;

public interface CartController {

    /**
     * get  /cart/data
     * 获取当前用户的所有购物车数据
     * @return
     */
    List<CartVo> cartData();

    /**
     * get /cart/checkout
     * 结算所有勾选的商品数据
     * @param searchMap 当前用户账户
     * @return
     */
    boolean checkout(Map searchMap);

}
