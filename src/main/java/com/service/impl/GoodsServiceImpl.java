package com.service.impl;

import com.dao.GoodsDao;
import com.pojo.Cart;
import com.pojo.Comments;
import com.pojo.Goods;
import com.pojo.GoodsCollection;
import com.service.GoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Resource
    private GoodsDao goodsDao;

    @Override
    public Goods selectGoodsById(Integer id) {
        return goodsDao.selectGoodsById(id);
    }

    @Override
    public Boolean addInCart(String account, Integer id, int num) {
        Cart cart = goodsDao.checkInCart(account, id);
        try{
            if(cart != null){
                num = cart.getNum() + num;
                goodsDao.updateCart(account, id, num);
                return true;
            }
            else{
                goodsDao.addInCart(account, id, num);
                return true;
            }
        } catch (Exception e){
            return false;
        }
    }

    @Override
    public Boolean addInCollection(String account, Integer id) {
        GoodsCollection goodsCollection = goodsDao.checkInCollection(account, id);
        if(goodsCollection != null)
            return true;
        else
            return goodsDao.addInCollection(account, id) == 1;
    }

    @Override
    public Boolean cancelCollection(String account, Integer id) {
        GoodsCollection goodsCollection = goodsDao.checkInCollection(account, id);
        try{
            if(goodsCollection != null)
                return goodsDao.removeFromCollection(account, id) == 1;
            else
                return true;
        } catch (Exception e){
            return false;
        }
    }

    @Override
    public Boolean checkInCollection(String account, Integer id) {
        return goodsDao.checkInCollection(account, id) != null;
    }

    @Override
    public List<Comments> selectCommentsByGoodsId(Integer id) {
        return goodsDao.selectCommentsByGoodsId(id);
    }

    @Override
    public List<Goods> selectRecommentsByCategoryId(Integer id) {
        return goodsDao.selectRecommentsByCategoryId(id);
    }
}
