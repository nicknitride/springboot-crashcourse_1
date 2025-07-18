package com.example.demo.myfirstapi.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    Product prod;
    @BeforeEach
    void setupProduct(){
        this.prod = new Product(23L,"Fresh Milk",34.5);
    }
    @Test
    void getId() {
        Assertions.assertEquals(23L,this.prod.getId());
    }
    @Test
    void setID(){
        this.prod.setId(200L);
        Assertions.assertEquals(200L,this.prod.getId());
    }
    @Test
    void getName() {
        Assertions.assertEquals("Fresh Milk",this.prod.getName());
    }
    @Test
    void setName(){
        this.prod.setName("AHHH");
        Assertions.assertEquals("AHHH",this.prod.getName());
    }

    @DisplayName("Get Price")
    @Test
    void getPrice(){
        Assertions.assertEquals(34.5,this.prod.getPrice());
    }
    @Test
    void setPrice(){
        this.prod.setPrice(212000d);
        Assertions.assertEquals(212000d,this.prod.getPrice());
    }
    @Test
    void testToString() {
        long id = 23L;
        String name = "Fresh Milk";
        double price = 34.5d;
        String result =  "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
        Assertions.assertEquals(result,this.prod.toString());
    }

    @Test
    void testEquals() {
        assertTrue(prod.equals(prod)); // Tests object equal
        assertFalse(prod.equals(null)); // Tests null false
        assertFalse(prod.equals("Michael")); // Tests non-matching class
    }

    @Test
    void testHashCode() {
        assertEquals(Objects.hash(23L,"Fresh Milk",34.5),this.prod.hashCode());
    }
}