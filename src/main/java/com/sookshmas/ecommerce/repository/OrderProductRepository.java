package com.sookshmas.ecommerce.repository;

import com.sookshmas.ecommerce.model.OrderProduct;
import com.sookshmas.ecommerce.model.OrderProductPK;
import org.springframework.data.repository.CrudRepository;

public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
}
