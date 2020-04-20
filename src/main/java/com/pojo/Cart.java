package com.pojo;

public class Cart {
    private String account;
    private Integer goodsId;
    private Integer num;

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

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "account='" + account + '\'' +
                ", goodsId=" + goodsId +
                ", num=" + num +
                '}';
    }
}
