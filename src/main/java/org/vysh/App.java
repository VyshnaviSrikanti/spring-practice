package org.vysh;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.vysh.cars.Corolla;
import org.vysh.cars.Swift;
import org.vysh.codes.Car;

public class App {

	public static void main(String[] args) {

		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Car mycar= context.getBean("Corolla",Car.class);
		System.out.println(mycar.specs());
		context.close();

	}

}
