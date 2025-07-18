package com.example.demo.myfirstapi.repository;

import com.example.demo.myfirstapi.model.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {

    public List<Product> products = Collections.synchronizedList(new ArrayList<>());
    public AtomicLong nextId = new AtomicLong(1);
    ProductRepository prodRep;
    @BeforeEach
    void setupProducts(){
        prodRep = new ProductRepository();
        products.add(new Product(nextId.getAndIncrement(), "Laptop", 1200.00));
        products.add(new Product(nextId.getAndIncrement(), "Mouse", 25.50));
        products.add(new Product(nextId.getAndIncrement(), "Keyboard", 75.00));
    }

    @Test
    void findAll() {
        Assertions.assertEquals(this.prodRep.findAll(),new ArrayList<>(products));
    }

    @Test
    void findById() {
        Optional<Product> actual = prodRep.findById(1L);
        Product expected = new Product(1L, "Laptop", 1200.0);
        Assertions.assertEquals(Optional.of(expected),actual);
    }

    @Test
    void save() {
        Product expected = new Product(1L, "Laptop",1200.0);
        Product actual = this.prodRep.save(expected);
        Assertions.assertEquals(expected,actual);
    }
}