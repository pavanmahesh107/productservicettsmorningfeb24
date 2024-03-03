package dev.pavan.productservicettsmorningfeb24.services;

import dev.pavan.productservicettsmorningfeb24.models.Category;
import dev.pavan.productservicettsmorningfeb24.models.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryService {

    //Category getSpecificCategory(String category);

    List<Product> getSpecificProductCategory(String name);
}
