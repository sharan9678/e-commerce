package com.sookshmas.ecommerce.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "ORDERS",
uniqueConstraints = {@UniqueConstraint(columnNames = "ORDER_NUM")})
@Getter
@Setter
public class Order implements Serializable {
    private static final long serialVersionUID = -2576670215015463100L;

    @Id
    @Column(name = "ID", length = 50)
    private String id;

    @Column(name = "AMOUNT", nullable = false)
    private double amount;

    @Column(name = "CUSTOMER_NAME", length = 255, nullable = false)
    private String customerName;

    @Column(name = "CUSTOMER_ADDRESS", length = 255, nullable = false)
    private String customerAddress;

    @Column(name = "CUSTOMER_EMAIL", length = 128, nullable = false)
    private String customerEmail;

    @Column(name = "CUSTOMER_PHONE", length = 128, nullable = false)
    private String customerPhone;

    @Column(name = "ORDER_DATE", nullable = false)
    private Date orderDate;

    @Column(name = "ORDER_NUM", nullable = false)
    private int orderNum;

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", amount=" + amount +
                ", customerName='" + customerName + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", customerPhone='" + customerPhone + '\'' +
                ", orderDate=" + orderDate +
                ", orderNum=" + orderNum +
                '}';
    }
}
