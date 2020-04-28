package com.group.subscription.service.impl;

import com.group.subscription.boundary.SubscriptionRequest;
import com.group.subscription.boundary.SubscriptionsResponse;
import com.group.subscription.domain.Customer;
import com.group.subscription.domain.Subscription;
import com.group.subscription.repository.CustomerRepository;
import com.group.subscription.repository.SubscriptionRepository;
import com.group.subscription.service.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubscriptionServiceImpl implements SubscriptionService {
    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    SubscriptionRepository subscriptionRepository;

    @Override
    public SubscriptionsResponse updateSubscription(SubscriptionRequest subscriptionRequest) {

        Customer customer = customerRepository.getCustomer(subscriptionRequest.getCustomerId());
        Subscription subscription = Subscription.builder()
                .subPackage(subscriptionRequest.getSubscriptionPackage())
                .subscriptionId("123")
                .customer(customer)
                .duration("12")
                .build();
        List<Subscription> subList = subscriptionRepository.addSubscription(subscription);
        SubscriptionsResponse subscriptionResponse = SubscriptionsResponse.builder()
                .subscriptionResponseList(subList)
                .customer(customer.getFirstName() + " " +customer.getLastName())
                .build();
        return subscriptionResponse;
    }
}
