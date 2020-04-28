package com.group.subscription.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Subscription {
    @JsonIgnore
    private Customer customer;

    private String subscriptionId;
    private String subPackage;
    private String duration;
    private Date expiry;
}
