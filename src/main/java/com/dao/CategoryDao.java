package com.dao;

import com.pojo.Category;

import java.util.List;

public interface CategoryDao {
    List<Category> getAllTopCategory();

    List<Category> getSubCategoryById(Integer id);
}
