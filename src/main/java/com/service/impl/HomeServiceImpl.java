package com.service.impl;

import com.dao.HomeDao;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pojo.Category;
import com.pojo.Goods;
import com.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class HomeServiceImpl implements HomeService {

    @Autowired
    private HomeDao homeDao;

    @Override
    public List<Goods> getSwiperData() {
        return homeDao.findHotGoods();
    }

    @Override
    public List<Category> getRecommendType() {
        return homeDao.findRecommendType();
    }

    @Override
    public List<Goods> loadData(Map searchMap) {
        Integer page = (Integer) searchMap.get("page");
        String type = (String) searchMap.get("type");
        PageHelper.startPage(page,5);
        List<Goods> goodsByTip = homeDao.findGoodsByTip(type);
        PageInfo<Goods> pageInfo = new PageInfo<Goods>(goodsByTip);
        return pageInfo.getList();
    }
}
