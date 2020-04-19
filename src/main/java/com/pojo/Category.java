package com.pojo;

public class Category {
    private Integer categoryId;
    private String img;
    private String subCategory;
    private Integer bigCategory;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public Integer getBigCategory() {
        return bigCategory;
    }

    public void setBigCategory(Integer bigCategory) {
        this.bigCategory = bigCategory;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", img='" + img + '\'' +
                ", subCategory='" + subCategory + '\'' +
                ", bigCategory=" + bigCategory +
                '}';
    }
}
