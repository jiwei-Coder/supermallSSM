package com.pojo;

public class CartVo {
    private Goods goods;
    private int num;

    @Override
    public String toString() {
        return "CartVo{" +
                "goods=" + goods +
                ", num=" + num +
                '}';
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
