package com.service.impl;

import com.dao.CartDao;
import com.pojo.Cart;
import com.pojo.CartVo;
import com.service.CartService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
public class CartServiceImpl implements CartService {

    Log log = LogFactory.getLog(CartServiceImpl.class);

    @Autowired
    private CartDao cartDao;

    @Override
    public List<CartVo> getCartByUserAccount(String account) {
        return cartDao.findCartByUserAccount(account);
    }

    @Override
    @Transactional
    public boolean checkout(Map searchMap) {
        String account = (String) searchMap.get("account");
        double totalmoney = (Double) searchMap.get("totalmoney");
        List<Cart> buyGoodsList = (List<Cart>) searchMap.get("buyGoodList");
        for (Cart cart : buyGoodsList) {
            cart.setAccount(account);
        }
        try{
            cartDao.checkout(buyGoodsList);
            cartDao.payFotGoods(account,totalmoney);
        }catch (Exception e){
            log.error(e);
            return false;
        }
        return true;
    }

}
