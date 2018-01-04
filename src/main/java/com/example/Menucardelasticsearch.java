package com.example;

import javax.persistence.Id;
import java.lang.annotation.Documented;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexname="hit",type="food",shards=1,replicas=0)
public class Menucardelasticsearch {
    @Id
    private String id;
    private String name;
    private int price;

    public Menucardelasticsearch() {
    }

    public Menucardelasticsearch(String id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
