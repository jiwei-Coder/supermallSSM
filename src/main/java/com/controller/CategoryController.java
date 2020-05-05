package com.controller;

import com.pojo.Category;

import java.util.List;

public interface CategoryController {
    List<Category> getAllTopCategoryController();
    List<Category> getSubCategoryByIdController(Integer id);
}
