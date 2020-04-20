package com.dao;

import com.pojo.Comments;
import com.pojo.Goods;
import com.pojo.GoodsCollection;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsDao {
    Goods selectGoodsById(Integer id);
    int addInCart(@Param("account") String account, @Param("id") Integer id, @Param("num") int num);
    int addInCollection(@Param("account") String account, @Param("id") Integer id);
    GoodsCollection checkInCollection(@Param("account") String account, @Param("id") Integer id);
    List<Comments> selectCommentsByGoodsId(@Param("id") Integer id);
    List<Goods> selectRecommentsByCategoryId(@Param("id") Integer id);
}
