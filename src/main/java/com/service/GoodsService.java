package com.service;

import com.pojo.Comments;
import com.pojo.Goods;

import java.util.List;

public interface GoodsService {

    Goods selectGoodsById(Integer id);
    Boolean addInCart(String account, Integer id, int num);
    Boolean addInCollection(String account, Integer id);
    Boolean checkInCollection(String account, Integer id);
    List<Comments> selectCommentsByGoodsId(Integer id);
    List<Goods> selectRecommentsByCategoryId(Integer id);
    Boolean cancelCollection(String account, Integer id);
}
