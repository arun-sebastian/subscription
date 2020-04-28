package com.group.subscription.repository.impl;

import com.group.subscription.domain.Customer;
import com.group.subscription.repository.CustomerRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {

    private static List<Customer> customerList= new ArrayList();

    static{
        customerList.add(Customer.builder().firstName("Steve").lastName("Sebastian").customerId("123").build());
    }

    @Override
    public Customer getCustomer(String customerId) {
        return customerList.stream().filter(e-> e.getCustomerId().equalsIgnoreCase(customerId)).collect(Collectors.toList()).get(0);
    }
}
