package com.service.impl;

import com.dao.CategoryDao;
import com.pojo.Category;
import com.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryDao categoryDao;
    @Override
    public List<Category> getAllTopCategoryService() {

        return categoryDao.getAllTopCategory();
    }

    @Override
    public List<Category> getSubCategoryByIdService(Integer id) {
        return categoryDao.getSubCategoryById(id);
    }
}
