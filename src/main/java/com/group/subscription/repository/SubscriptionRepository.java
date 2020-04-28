package com.group.subscription.repository;

import com.group.subscription.domain.Subscription;

import java.util.List;

public interface SubscriptionRepository {

    List<Subscription> addSubscription(Subscription subscription);
}
