package dev.pavan.productservicettsmorningfeb24.controllers;


import dev.pavan.productservicettsmorningfeb24.models.Category;
import dev.pavan.productservicettsmorningfeb24.services.CategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {

    private CategoryService categoryService;

    public CategoryController(CategoryService categoryService){

        this.categoryService = categoryService;
    }

    @GetMapping("categories/{category}")
    public Category getSpecificProductCategory(@PathVariable("category") String category){
                return categoryService.getSpecificCategory(category);
    }
}
