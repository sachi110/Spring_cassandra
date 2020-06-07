package com.techm.springcasendra.repositories;


import com.techm.springcasendra.domain.Product;
import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;


@Repository
public interface ProductRepository extends CassandraRepository<Product, UUID> {
    @AllowFiltering
    List<Product> findByPrice(int age);

}
