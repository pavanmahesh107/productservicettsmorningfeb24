package dev.pavan.productservicettsmorningfeb24;

import dev.pavan.productservicettsmorningfeb24.controllers.ProductController;
import dev.pavan.productservicettsmorningfeb24.models.Product;
import dev.pavan.productservicettsmorningfeb24.services.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class Productservicettsmorningfeb24Application {

    public static void main(String[] args) {


        SpringApplication.run(Productservicettsmorningfeb24Application.class, args);
    }

}
