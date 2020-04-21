package com.dao;

import com.pojo.Cart;
import com.pojo.Comments;
import com.pojo.Goods;
import com.pojo.GoodsCollection;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsDao {
    Goods selectGoodsById(Integer id);

    Cart checkInCart(@Param("account") String account, @Param("id") Integer id);

    int updateCart(@Param("account") String account, @Param("id") Integer id, @Param("num") int num);

    int addInCart(@Param("account") String account, @Param("id") Integer id, @Param("num") int num);

    int addInCollection(@Param("account") String account, @Param("id") Integer id);

    int removeFromCollection(@Param("account") String account, @Param("id") Integer id);

    GoodsCollection checkInCollection(@Param("account") String account, @Param("id") Integer id);

    List<Comments> selectCommentsByGoodsId(@Param("id") Integer id);

    List<Goods> selectRecommentsByCategoryId(@Param("id") Integer id);
}
