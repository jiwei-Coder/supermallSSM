package com.service;

import com.pojo.CartVo;

import java.util.List;
import java.util.Map;

public interface CartService {

    List<CartVo> getCartByUserAccount(String account);

    boolean checkout(Map searchMap);
}
