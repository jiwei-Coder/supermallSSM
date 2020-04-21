package com.dao;

import com.pojo.Cart;
import com.pojo.CartVo;

import java.util.List;

public interface CartDao {

    List<CartVo> findCartByUserAccount(String account);

    void checkout(List<Cart> cartList);

    void payFotGoods(String account , double totalmoney);

}
