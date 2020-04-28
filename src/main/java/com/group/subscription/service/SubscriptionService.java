package com.group.subscription.service;

import com.group.subscription.boundary.SubscriptionRequest;
import com.group.subscription.boundary.SubscriptionsResponse;

public interface SubscriptionService {
    SubscriptionsResponse updateSubscription(SubscriptionRequest subscriptionRequest);
}
