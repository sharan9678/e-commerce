package com.sookshmas.ecommerce.repository;


import com.sookshmas.ecommerce.model.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer> {
    Category findByCategoryName(String categoryName);
}
