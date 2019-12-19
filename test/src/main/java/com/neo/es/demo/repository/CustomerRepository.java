package com.neo.es.demo.repository;

import com.neo.es.demo.model.Customer;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.io.Serializable;
import java.util.List;

public interface CustomerRepository extends ElasticsearchRepository<Customer, String> {
    List<Customer> findByFirstname(String firstName);
}
