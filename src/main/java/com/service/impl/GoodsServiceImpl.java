package com.service.impl;

import com.dao.GoodsDao;
import com.pojo.Comments;
import com.pojo.Goods;
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
        return goodsDao.addInCart(account, id, num) == 1;
    }

    @Override
    public Boolean addInCollection(String account, Integer id) {
        return goodsDao.addInCollection(account, id) == 1;
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
