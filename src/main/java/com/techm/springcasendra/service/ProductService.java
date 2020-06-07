package com.techm.springcasendra.service;

import com.techm.springcasendra.domain.Product;

import java.util.List;
import java.util.UUID;


public interface ProductService {

    List<Product> listAll();

    Product getById(UUID id);

    Product saveOrUpdate(Product product);

    void delete(UUID id);

}