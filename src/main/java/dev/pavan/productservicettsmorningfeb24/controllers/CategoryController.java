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

    @GetMapping("/categories/{name}")
    public Category getSpecificProductCategory(@PathVariable("name") String name){
                return (Category) categoryService.getSpecificProductCategory(name);
    }
}
