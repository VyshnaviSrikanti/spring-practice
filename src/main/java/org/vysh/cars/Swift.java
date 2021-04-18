package org.vysh.cars;

import org.springframework.stereotype.Component;
import org.vysh.codes.Car;

@Component("Swift")
public class Swift implements Car {

	@Override
	public String specs() {
				return "Hatchback from suzuki";
	}

}
