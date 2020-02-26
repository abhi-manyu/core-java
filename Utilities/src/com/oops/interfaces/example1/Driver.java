package com.oops.interfaces.example1;

public class Driver {

	void drive(Car c)
	{
		c.start();
		c.stop();
		c.accelerate();
		if(c instanceof BMW_car)
			((BMW_car)c).playMusic();
		else
			((Audi_Car)c).playMusic();
	}
	
}
