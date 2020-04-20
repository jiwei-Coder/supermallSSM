package com.pojo;

public class Goods {
    private Integer goodsId;
    private String name;
    private String title;
    private double price;
    private double reallyPrice;
    private String imgs;
    private String showimg;
    private String priceInterval;
    private String categoryId;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getReallyPrice() {
        return reallyPrice;
    }

    public void setReallyPrice(double reallyPrice) {
        this.reallyPrice = reallyPrice;
    }

    public String getImgs() {
        return imgs;
    }

    public void setImgs(String imgs) {
        this.imgs = imgs;
    }

    public String getShowimg() {
        return showimg;
    }

    public void setShowimg(String showimg) {
        this.showimg = showimg;
    }

    public String getPriceInterval() {
        return priceInterval;
    }

    public void setPriceInterval(String priceInterval) {
        this.priceInterval = priceInterval;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goodsId=" + goodsId +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", reallyPrice=" + reallyPrice +
                ", imgs='" + imgs + '\'' +
                ", showimg='" + showimg + '\'' +
                ", priceInterval='" + priceInterval + '\'' +
                ", categoryId='" + categoryId + '\'' +
                '}';
    }
}
