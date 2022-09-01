package com.sookshmas.ecommerce.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "PRODUCTS")
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", createDate=" + createDate +
                '}';
    }
}
