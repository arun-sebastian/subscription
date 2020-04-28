package com.group.subscription.boundary;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SubscriptionRequest {
    private String subscriptionPackage;
    private String customerId;
    private int duration;
}
