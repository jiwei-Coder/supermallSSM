package com.pojo;

import java.util.Date;

public class Comments {
    private String account;
    private Integer goodsId;
    private Date time;
    private String imgs;
    private String content;

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

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getImgs() {
        return imgs;
    }

    public void setImgs(String imgs) {
        this.imgs = imgs;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Comments{" +
                "account='" + account + '\'' +
                ", goodsId=" + goodsId +
                ", time=" + time +
                ", imgs='" + imgs + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
