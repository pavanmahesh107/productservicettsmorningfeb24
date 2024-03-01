package dev.pavan.productservicettsmorningfeb24.services;

import dev.pavan.productservicettsmorningfeb24.dtos.FakeStoreCategoryDto;
import dev.pavan.productservicettsmorningfeb24.models.Category;
import dev.pavan.productservicettsmorningfeb24.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FakeStoreCategoryService implements CategoryService{

    private RestTemplate restTemplate;

    public FakeStoreCategoryService(RestTemplate restTemplate) {

        this.restTemplate = restTemplate;
    }


    @Override
    public Category getSpecificCategory(String category) {

             FakeStoreCategoryDto fakeStoreCategory = restTemplate.getForObject("https://fakestoreapi.com/products/category/" + category,
                                                    FakeStoreCategoryDto.class
        );
        return fakeStoreCategory.toCategory();
    }
}
