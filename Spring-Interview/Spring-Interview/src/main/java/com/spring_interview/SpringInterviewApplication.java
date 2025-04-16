package com.spring_interview;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringInterviewApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(SpringInterviewApplication.class, args);
//		System.out.println("started");

		/*Car car = context.getBean(Car.class);
		car.show();*/

//		Racing v = context.getBean(Racing.class);
//
//		v.getVehicle().speed();


	}

}
