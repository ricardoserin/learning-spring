package com.ricardoserin.learningspring.service;

import com.ricardoserin.learningspring.model.entity.Customer;

public interface ICustomerService {
    Customer save(Customer customer);

    Customer findById(Integer id);

    void delete(Customer customer);
}
