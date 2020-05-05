package com.service;

import com.pojo.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAllTopCategoryService();

    List<Category> getSubCategoryByIdService(Integer id);
}
