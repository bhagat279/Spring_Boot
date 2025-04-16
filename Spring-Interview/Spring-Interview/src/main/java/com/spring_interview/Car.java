package com.spring_interview;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("car")
public class Car implements Vehicle {
    public Car()
    {
        System.out.println("bean initialized");
    }


   /* @PostConstruct
    public void init()
    {
        System.out.println("starting");
    }

    @PreDestroy
    public void destroy()
    {
        System.out.println("desrtroying");
    }

    public  void show()
    {
        System.out.println("this is my car");
    }*/

    @Override
    public void speed() {
        System.out.println(" car speed is 80");
    }

}
