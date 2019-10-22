package com.codegym.model;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String product_code;
    private String product_name;
    private String new_price;
    private String old_price;
    private String main_content;
    private String sub_content;
    private String image;

    @Override
    public String toString() {
        return String.format("Product[id=%d, product_name='%s']", id, product_name);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getProduct_code() {
        return product_code;
    }

    public void setProduct_code(String product_code) {
        this.product_code = product_code;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getNew_price() {
        return new_price;
    }

    public void setNew_price(String new_price) {
        this.new_price = new_price;
    }

    public String getOld_price() {
        return old_price;
    }

    public void setOld_price(String old_price) {
        this.old_price = old_price;
    }

    public String getMain_content() {
        return main_content;
    }

    public void setMain_content(String main_content) {
        this.main_content = main_content;
    }

    public String getSub_content() {
        return sub_content;
    }

    public void setSub_content(String sub_content) {
        this.sub_content = sub_content;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Product(String product_code, String product_name, String new_price, String old_price, String main_content, String sub_content, String image) {
        this.product_code = product_code;
        this.product_name = product_name;
        this.new_price = new_price;
        this.old_price = old_price;
        this.main_content = main_content;
        this.sub_content = sub_content;
        this.image = image;
    }

    public Product() {
    }

}
