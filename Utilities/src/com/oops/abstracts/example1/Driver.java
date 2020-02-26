package com.oops.abstracts.example1;

public class Driver {

	void drive(Car c)
	{
		c.start();
		c.stop();
		
		if(c instanceof BMW_Car)
			((BMW_Car) c).playMusic();
		if(c instanceof Audi_Car)
			((Audi_Car) c).accelerate();
	}
}
