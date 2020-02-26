package com.oops.abstracts.example1;

public class Audi_Car extends Car {

	@Override
	void start() {
		System.out.println("Audi car is started");
	}

	@Override
	void stop() {
		System.out.println("Audi car is stopped");
	}

	void accelerate()
	{
		System.out.println("Audi car is acccelerating");
	}
}
