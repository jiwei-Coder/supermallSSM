package com.pojo;

public class Collection {
    private String account;
    private Integer goodsId;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
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
                "account='" + account + '\'' +
                ", goodsId=" + goodsId +
                '}';
    }
}
