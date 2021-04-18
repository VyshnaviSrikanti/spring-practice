package org.vysh.specs;

import org.springframework.stereotype.Component;
import org.vysh.cars.Engine;
@Component("V6Engine")
public class V6 implements Engine {

	@Override
	public String type() {
		// TODO Auto-generated method stub
		return "Engine V6";
	}

}
