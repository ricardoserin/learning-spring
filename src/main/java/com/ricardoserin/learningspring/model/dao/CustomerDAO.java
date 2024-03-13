package com.ricardoserin.learningspring.model.dao;

import com.ricardoserin.learningspring.model.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerDAO extends CrudRepository<Customer, Integer> {
}
