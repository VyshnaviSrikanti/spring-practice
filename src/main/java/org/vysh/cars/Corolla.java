package org.vysh.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.vysh.codes.Car;

@Component("Corolla")
public class Corolla implements Car {
	
	@Autowired
	@Qualifier("V6Engine")
	Engine engine;
	




	@Override
	public String specs() {
		
		String specs= "Sedan from Toyota with engine type as "+engine.type();
		return specs;
	}
	}
