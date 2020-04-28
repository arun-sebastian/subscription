package com.group.subscription.controller;

import com.group.subscription.boundary.SubscriptionRequest;
import com.group.subscription.boundary.SubscriptionsResponse;
import com.group.subscription.service.SubscriptionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping("/org")
@Api(tags = "Subscription Controller")
public class SubscriptionController {

    @Autowired
    SubscriptionService  subscriptionService;

    @PostMapping(value = {"/v1/updateSubscription"},
            headers = {"Accept=application/json", "Content-Type=application/json"},
            produces = "application/json")
    @ApiOperation(value = "Add Subscription to an existing customer",
            notes = "CustpmerId, subscription package and duration as input",
            response = SubscriptionsResponse.class)
    public ResponseEntity<SubscriptionsResponse> generateRreportsFromJson
            ( @RequestBody SubscriptionRequest subscriptionRequest) {
        SubscriptionsResponse reportResponseData = subscriptionService.updateSubscription(subscriptionRequest);
        if(Objects.nonNull(reportResponseData)){
            return new ResponseEntity<SubscriptionsResponse>(reportResponseData, HttpStatus.OK);
        } else {
            return new ResponseEntity<SubscriptionsResponse>(HttpStatus.BAD_REQUEST);
        }
    }
}
