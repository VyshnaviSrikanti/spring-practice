package org.vysh.specs;

import org.springframework.stereotype.Component;
import org.vysh.cars.Engine;
@Component("V8Engine")
public class V8 implements Engine{

	@Override
	public String type() {
				return "V8 engine"	;
	}
	

}
