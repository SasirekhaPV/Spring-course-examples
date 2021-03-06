package org.spring.course;

import org.spring.course.cars.Corolla;
import org.spring.course.cars.Swift;
import org.spring.course.interfaces.Car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {

		Car firstCar = new Swift();
		Car secondCar = new Corolla();

		System.out.println(firstCar.getSpec());
		System.out.println(secondCar.getSpec());

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		//Car myCar = context.getBean("swift", Car.class);
		Car myCar = context.getBean("corolla", Car.class);
		
		System.out.println(myCar.getSpec());
	}

}
