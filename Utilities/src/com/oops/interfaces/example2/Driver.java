package com.oops.interfaces.example2;

public class Driver {

	void drive(Car c)
	{
		c.start();
		c.stop();
		if(c instanceof BMW_car)
		{
			((BMW_car)c).playMusic();
			((BMW_car) c).wash();
		}
		if(c instanceof Audi_Car)
		{
			((Audi_Car) c).accelerate();
			((Audi_Car) c).wash();
		}
	}
	
}
