package com.example;


//import org.springframework.boot.orm.jpa.EntityScan;
import jnr.ffi.annotations.In;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

import javax.persistence.Entity;

@Entity
@Table
public class Menu_card {
    @PrimaryKey
    private Integer id;
    private String name;
    private Integer price;

    public Menu_card() {
    }

    public Menu_card(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }



}
