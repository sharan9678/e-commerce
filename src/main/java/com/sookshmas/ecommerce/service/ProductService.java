package com.sookshmas.ecommerce.service;

import com.sookshmas.ecommerce.model.Product;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Validated
public interface ProductService {
    @NotNull
    Iterable<Product> getAllProduct();

    Product getProduct(@Min(value = 1L, message = "Invalid product ID.") long id);

    Product save(Product product);
}
