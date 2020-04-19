package com.pojo;

public class Collection {
    private Integer userId;
    private Integer goodsId;

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

    @Override
    public String toString() {
        return "Collection{" +
                "userId=" + userId +
                ", goodsId=" + goodsId +
                '}';
    }
}
