package com.group.subscription.repository;

import com.group.subscription.domain.Customer;

public interface CustomerRepository {
    Customer getCustomer(String customerId);
}
