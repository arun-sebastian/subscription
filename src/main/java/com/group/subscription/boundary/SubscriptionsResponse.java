package com.group.subscription.boundary;

import com.group.subscription.domain.Subscription;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SubscriptionsResponse {
    private String customer;
    private List<Subscription> subscriptionResponseList;
}
