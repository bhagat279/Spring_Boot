package com.bean_scope;

import com.bean_scope.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BeanScopeApplication implements CommandLineRunner {
	@Autowired
	private Order order;

	@Autowired
	private Order order2;
	public static void main(String[] args) {
		SpringApplication.run(BeanScopeApplication.class, args);


	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(order.hashCode());
		System.out.println(order2.hashCode());
	}
}
