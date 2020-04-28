package com.group.subscription.repository.impl;

import com.group.subscription.domain.Subscription;
import com.group.subscription.repository.SubscriptionRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SubscriptionRepositoryImpl implements SubscriptionRepository {
   private static List<Subscription> subscriptionList= new ArrayList();


    @Override
    public List<Subscription> addSubscription(Subscription subscription) {
        subscriptionList.add(subscription);
        return subscriptionList;
    }
}
