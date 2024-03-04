package dev.pavan.productservicettsmorningfeb24.services;

import dev.pavan.productservicettsmorningfeb24.models.Product;

import java.util.List;

public interface ProductService {

    Product getSingleProduct(Long productId);

    List<Product> getAllProducts();

    Product createProduct(String title,
                          String description,
                          String category,
                          double price,
                          String image);

    Product deleteProduct(Long ProductId);

    Product updateProduct(Long productId);

    List<String> getAllCategories();

    List<Product> getParticularCategory(String category);
}
