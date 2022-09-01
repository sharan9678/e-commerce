package com.sookshmas.ecommerce.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ORDER_DETAILS")
public class OrderDetail implements Serializable{

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

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