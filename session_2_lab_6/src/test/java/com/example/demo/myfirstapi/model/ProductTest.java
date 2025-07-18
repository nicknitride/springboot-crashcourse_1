package com.example.demo.myfirstapi.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    Product prod;
    @BeforeEach
    void setupProduct(){
        this.prod = new Product(23L,"Fresh Milk",34.5);
    }
    @Test
    void getId() {
        Assertions.assertEquals("Fresh Milk",this.prod.getId());
    }

    @Test
    void getName() {
        Assertions.assertEquals("Fresh Milk",this.prod.getName());

    }

    @Test
    void getPrice() {
        Assertions.assertEquals(34.5,this.prod.getPrice());
    }

    @Test
    void setId() {

    }

    @Test
    void setName() {
    }

    @Test
    void setPrice() {
    }

    @Test
    void testToString() {
    }

    @Test
    void testEquals() {
    }

    @Test
    void testHashCode() {
    }
}