package dev.pavan.productservicettsmorningfeb24.services;

import dev.pavan.productservicettsmorningfeb24.models.Product;

import java.util.List;

public class OwnDatabaseProductService implements ProductService{
    @Override
    public Product getSingleProduct(Long productId) {
        return null;
    }

    @Override
    public List<Product> getProducts() {
        return null;
    }

    @Override
    public Product createProduct(String title, String description, String category, double price, String image) {
        return null;
    }
}
