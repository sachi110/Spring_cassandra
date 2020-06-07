package com.techm.springcasendra.repositories;


import com.techm.springcasendra.domain.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;



public interface ProductRepository extends CrudRepository<Product, UUID> {
}
