package com.sookshmas.ecommerce.repository;

import com.sookshmas.ecommerce.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
