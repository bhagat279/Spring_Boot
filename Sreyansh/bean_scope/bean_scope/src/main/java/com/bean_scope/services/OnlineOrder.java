package com.bean_scope.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("online")
public class OnlineOrder implements Order{
    @Override
    public void createOrder() {
        System.out.println("online order created");
    }
}
