package com.sookshmas.ecommerce.repository;

import com.sookshmas.ecommerce.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
