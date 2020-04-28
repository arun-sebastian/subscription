package com.group.subscription.boundary;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SubscriptionResponse {
    private String subscriptionName;
    private int duration;
    private String expiry;
}
