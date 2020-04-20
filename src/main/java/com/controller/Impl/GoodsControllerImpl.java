package com.controller.Impl;

import com.controller.GoodsController;
import com.pojo.Comments;
import com.pojo.Goods;
import com.service.impl.GoodsServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/good")
public class GoodsControllerImpl implements GoodsController{

    @Resource
    private GoodsServiceImpl goodsServiceImpl;

    @RequestMapping(value = "/detail", method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
    public Goods getDetail(Integer id){
        return goodsServiceImpl.selectGoodsById(id);
    }

    @RequestMapping(value = "/addcart", method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
    public Boolean addCart(String account, Integer id, int num){
        return goodsServiceImpl.addInCart(account, id, num);
    }

    @RequestMapping(value = "/addcollection", method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
    public Boolean addCollection(String account, Integer id){
        return goodsServiceImpl.addInCollection(account, id);
    }

    @RequestMapping(value = "/iscollection", method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
    public Boolean isCollection(String account, Integer id){
        return goodsServiceImpl.checkInCollection(account, id);
    }

    @RequestMapping(value = "/comments", method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
    public List<Comments> queryComments(Integer id){
        return goodsServiceImpl.selectCommentsByGoodsId(id);
    }

    @RequestMapping(value = "/recommend", method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
    public List<Goods> queryRecommend(Integer id){
        return goodsServiceImpl.selectRecommentsByCategoryId(id);
    }
}
