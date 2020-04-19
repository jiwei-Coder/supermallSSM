package com.pojo;

public class Cart {
    private Integer userId;
    private Integer goodsId;
    private Integer num;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "userId=" + userId +
                ", goodsId=" + goodsId +
                ", num=" + num +
                '}';
    }
}
