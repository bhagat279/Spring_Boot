package com.bean_scope.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("offline")
public class OfflineOrder implements Order{
    @Override
    public void createOrder() {
        System.out.println("offline order created");
    }
}
