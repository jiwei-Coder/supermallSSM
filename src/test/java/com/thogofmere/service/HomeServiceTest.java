package com.thogofmere.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pojo.Goods;
import com.service.HomeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"})
public class HomeServiceTest {

    ObjectMapper objectMapper = new ObjectMapper();

    @Autowired
    private HomeService homeService;

    @Test
    public void testLoadData(){
        Map searchMap = new HashMap();
        searchMap.put("type","流行");
        searchMap.put("page",1);
        List<Goods> goodsList = homeService.loadData(searchMap);
        System.out.println("===========");
        try {
            System.out.println(objectMapper.writeValueAsString(goodsList));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println("===========");

    }

}
