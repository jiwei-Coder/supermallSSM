package com.thogofmere.service;

import com.pojo.Cart;
import com.pojo.CartVo;
import com.pojo.Goods;
import com.service.CartService;
import com.service.GoodsService;
import com.service.impl.GoodsServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"})
public class CartServiceTest {

    @Autowired
    CartService cartService;

    @Autowired
    GoodsService goodsService;

    @Test
    public void testCheckOut() {

        Map searchMap = new HashMap();
        searchMap.put("totalmoney", 100.0);
        List<Cart> list = new ArrayList<>();
        Cart cart = new Cart();
        cart.setAccount("jack");
        cart.setGoodsId(7);
        cart.setNum(1);
        Cart cart2 = new Cart();
        cart2.setAccount("jack");
        cart2.setGoodsId(1);
        cart2.setNum(1);
        list.add(cart);
        list.add(cart2);
        searchMap.put("buyGoodList", list);
        searchMap.put("account", "jack");
        cartService.checkout(searchMap);
    }

    @Test
    public void loadCartData(){
        List<CartVo> cartByUserAccount = cartService.getCartByUserAccount("123");
        System.out.println(cartByUserAccount);
    }

    @Test
    public void testSelectGoodsById(){
        Goods goods = goodsService.selectGoodsById(1);
        System.out.println(goods);
    }
}

