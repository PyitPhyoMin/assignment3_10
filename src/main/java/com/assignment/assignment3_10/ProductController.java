package com.assignment.assignment3_10;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/products") // Class level mapping for all the endpoints in the class.[Min]
public class ProductController {
    // using logger, spring-boot-starter-web includes Logback by default.[Min]
    private static final Logger logger = LoggerFactory.getLogger(ProductController.class);
    private ArrayList<Product> products = new ArrayList<>();

    public ProductController() {
        // use Builder to set a sample product for Get Products endpoint.[Min]
        products.add(Product.builder().name("Vital C").description("Vitamin C").price(85).build());
    }

    @GetMapping("")
    public ArrayList<Product> getAllProducts() {
        logger.info("☑️ --->Getting All Products.");
        return products;
    }

    @PostMapping("")
    public Product createProduct(@RequestBody Product product) {
        logger.info("📦 --->Create a new product: " + product.getName());
        products.add(product);
        return product;
    }

}
