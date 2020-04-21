package com.thogofmere.dao;

import com.dao.HomeDao;
import com.pojo.Category;
import com.pojo.Goods;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"})
public class HomeDaoTest {
    @Autowired
    private HomeDao homeDao;

    @Test
    public void testFindHotGoods(){
        List<Goods> hotGoods = homeDao.findHotGoods();
        System.out.println(hotGoods);
    }

    @Test
    public void testFindRecommendType(){
        List<Category> recommendType = homeDao.findRecommendType();
        System.out.println(recommendType);
    }

    @Test
    public void testFindGoodsByTip(){
        List<Goods> goods = homeDao.findGoodsByTip("流行");
        System.out.println(goods);
        System.out.println(goods.size());
    }

}
