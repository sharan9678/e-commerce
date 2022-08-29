package com.sookshmas.ecommerce.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ORDER_DETAILS")
@Getter
@Setter
public class OrderDetails implements Serializable{

    private static final long serialVersionUID = 7550745928843183535L;

    @Id
    @Column(name = "ID",length=50,nullable=false)
    private String id;

    @Column(name = "AMOUNT", nullable = false)
    private double amount;

    @Column(name = "PRICE", nullable = false)
    private double price;

    @Column(name = "QUANTITY", nullable = false)
    private int quantity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORDER_ID", nullable = false,
            foreignKey = @ForeignKey(name = "ORDER_DETAIL_ORD_FK"))
    private Order order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUCT_ID", nullable = false,
            foreignKey = @ForeignKey(name = "ORDER_DETAIL_PROD_FK"))
    private Product product;

    @Override
    public String toString() {
        return "OrderDetails{" +
                "id='" + id + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                ", quantity=" + quantity +
                ", order=" + order +
                ", product=" + product +
                '}';
    }
}