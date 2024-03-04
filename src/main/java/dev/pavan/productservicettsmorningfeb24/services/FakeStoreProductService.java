package dev.pavan.productservicettsmorningfeb24.services;

import dev.pavan.productservicettsmorningfeb24.dtos.FakeStoreProductDto;
import dev.pavan.productservicettsmorningfeb24.models.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FakeStoreProductService implements ProductService {
    //Rest Template
    //This class allows to send HTTP Request to external URLs
    //and get responses.

    private RestTemplate restTemplate;

    public FakeStoreProductService(RestTemplate restTemplate) {

        this.restTemplate = restTemplate;
    }

    @Override
    public Product getSingleProduct(Long productId) {

        FakeStoreProductDto fakeStoreProduct = restTemplate.getForObject("https://fakestoreapi.com/products/" + productId,
                FakeStoreProductDto.class
        );
        return fakeStoreProduct.toProduct();
    }

    @Override
    public List<Product> getAllProducts() {
        ResponseEntity<Product[]> responseEntity = restTemplate.getForEntity(
                "https://fakestoreapi.com/products", Product[].class);

        if (responseEntity.getStatusCode() == HttpStatus.OK) {
            Product[] products = responseEntity.getBody();
            if (products != null) {
                return Arrays.asList(products);
            }
        }

        return Collections.emptyList();
    }


    @Override
    public Product createProduct(String title,
                                 String description,
                                 String category,
                                 double price,
                                 String image) {

        FakeStoreProductDto fakeStoreProductDto = new FakeStoreProductDto();
        fakeStoreProductDto.setTitle(title);
        fakeStoreProductDto.setDescription(description);
        fakeStoreProductDto.setCategory(category);
        fakeStoreProductDto.setPrice(price);
        fakeStoreProductDto.setImage(image);
        FakeStoreProductDto response = restTemplate.postForObject("https://fakestoreapi.com/products", //url
                fakeStoreProductDto, //request body
                FakeStoreProductDto.class); //data type of response (response json converting the json response into an object this class)


        return response.toProduct();
    }

    @Override
    public Product deleteProduct(Long productId) {

        FakeStoreProductDto fakeStoreProduct = restTemplate.getForObject("https://fakestoreapi.com/products/" + productId,
                FakeStoreProductDto.class
        );
        return fakeStoreProduct.toProduct();
    }

    @Override
    public Product updateProduct(Long productId) {


        FakeStoreProductDto fakeStoreProduct = restTemplate.getForObject("https://fakestoreapi.com/products/" + productId,
                FakeStoreProductDto.class
        );
        return fakeStoreProduct.toProduct();
    }


    @Override
    public List<String> getAllCategories() {
        ResponseEntity<String[]> responseEntity = restTemplate.getForEntity(
                "https://fakestoreapi.com/products/categories", String[].class);

        if (responseEntity.getStatusCode() == HttpStatus.OK) {
            String[] categories = responseEntity.getBody();
            if (categories != null) {
                return Arrays.asList(categories);
            }
        }

        return Collections.emptyList();
    }

    @Override
    public List<Product> getParticularCategory(String category) {
        ResponseEntity<Product[]> responseEntity = restTemplate.getForEntity(
                "https://fakestoreapi.com/products/category/" + category, Product[].class);

        if (responseEntity.getStatusCode() == HttpStatus.OK) {
            Product[] products = responseEntity.getBody();
            if (products != null) {
                return Arrays.asList(products);
            }
        }

        return Collections.emptyList();
    }

}


