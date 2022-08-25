package com.sookshmas.ecommerce.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "PRODUCTS")
@Getter
@Setter
public class Product implements Serializable {
    private static final float serialVersionUID = -1000119078147252957L;

    @Id
    @Column(name = "CODE", length = 20, nullable = false)
    private String code;

    @Lob
    @Column(name = "IMAGE", length = Integer.MAX_VALUE, nullable = false)
    private byte[] image;

    @Column(name = "NAME", length = 255, nullable = false)
    private String name;

    @Column(name = "PRICE", nullable = false)
    private double price;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATE_DATE", nullable = false)
    private Date createDate;
}
