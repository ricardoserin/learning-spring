package com.ricardoserin.learningspring.service;

import com.ricardoserin.learningspring.model.dao.CustomerDAO;
import com.ricardoserin.learningspring.model.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;

public class ICustomerServiceImpl implements ICustomerService {

    @Autowired
    private CustomerDAO customerDAO;

    @Override
    public Customer save(Customer customer) {
        return customerDAO.save(customer);
    }

    @Override
    public Customer findById(Integer id) {
        return null;
    }

    @Override
    public void delete(Customer customer) {

    }
}
