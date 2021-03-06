package com.dao;

import com.pojo.Cart;
import com.pojo.CartVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CartDao {

    List<CartVo> findCartByUserAccount(String account);

    void checkout(List<Cart> cartList);

    void payFotGoods(@Param("account") String account , @Param("totalmoney") double totalmoney);

}
