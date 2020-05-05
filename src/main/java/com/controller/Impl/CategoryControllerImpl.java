package com.controller.Impl;

import com.controller.CategoryController;
import com.pojo.Category;
import com.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
public class CategoryControllerImpl implements CategoryController  {
    @Autowired
    private CategoryService categoryService;

    @Override
    @GetMapping("/category")
    @ResponseBody
    public List<Category> getAllTopCategoryController() {
        return categoryService.getAllTopCategoryService();
    }

    @Override
    @GetMapping("/subcategory")
    @ResponseBody
    public List<Category> getSubCategoryByIdController(Integer id) {
        return categoryService.getSubCategoryByIdService(id);
    }
}

