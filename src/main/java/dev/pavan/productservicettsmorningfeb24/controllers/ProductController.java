package dev.pavan.productservicettsmorningfeb24.controllers;

import dev.pavan.productservicettsmorningfeb24.dtos.CreateProductRequestDto;
import dev.pavan.productservicettsmorningfeb24.models.Product;
import dev.pavan.productservicettsmorningfeb24.services.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {


    private ProductService productService;

    public ProductController(ProductService productService){

        this.productService = productService;
    }

    @PostMapping("/products")
    public Product createProduct(@RequestBody CreateProductRequestDto requestDto){
        return productService.createProduct(
                requestDto.getTitle(),
                requestDto.getDescription(),
                requestDto.getCategory(),
                requestDto.getPrice(),
                requestDto.getImage()
        );
    }
    @GetMapping("/products/{id}")
    public Product getProductDetails(@PathVariable("id") Long productId){
        return productService.getSingleProduct(productId);


    }
    @GetMapping("/products")
    public void getAllProduct(){


    }
    @PutMapping("/products")
    public void updateProduct(){


    }
    @DeleteMapping("/products/{id}")
    public Product deleteProduct(@PathVariable("id") Long productId){
        return productService.deleteProduct(productId);
    }

}
