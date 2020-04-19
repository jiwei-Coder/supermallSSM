package com.pojo;

import java.util.Date;

public class Comments {
    private Integer userId;
    private Integer goodsId;
    private Date time;
    private String imgs;
    private String content;

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
                "userId=" + userId +
                ", goodsId=" + goodsId +
                ", time=" + time +
                ", imgs='" + imgs + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
