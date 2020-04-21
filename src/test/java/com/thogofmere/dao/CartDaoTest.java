package com.thogofmere.dao;

import com.dao.CartDao;
import com.pojo.Cart;
import com.pojo.CartVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"})
public class CartDaoTest {

    @Autowired
    private CartDao cartDao;

    @Test
    public void testFindCartByUserAccount(){
        List<CartVo> cartByUserAccount = cartDao.findCartByUserAccount("123");
        System.out.println(cartByUserAccount.size());
        System.out.println(cartByUserAccount);
    }

    @Test
    public void testCheckout(){
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
        cartDao.checkout(list);
        System.out.println("==================");
        //System.out.println(checkout);
        List<CartVo> cartByUserAccount = cartDao.findCartByUserAccount("jack");
        System.out.println(cartByUserAccount);
    }

    @Test
    public  void testPay(){
        cartDao.payFotGoods("123",100);
    }

}
