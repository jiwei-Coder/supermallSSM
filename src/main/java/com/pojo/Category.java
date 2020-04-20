package com.pojo;

public class Category {
    private Integer categoryId;
    private String img;
    private String category;
    private Integer bigCategoryId;

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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getBigCategoryId() {
        return bigCategoryId;
    }

    public void setBigCategoryId(Integer bigCategoryId) {
        this.bigCategoryId = bigCategoryId;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", img='" + img + '\'' +
                ", category='" + category + '\'' +
                ", bigCategoryId=" + bigCategoryId +
                '}';
    }
}
