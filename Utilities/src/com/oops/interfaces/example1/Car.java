package com.oops.interfaces.example1;

public abstract class Car implements Drivable, Washable
{

	@Override
	public void start() {
		System.out.println("car is started");
	}

	@Override
	public void stop() {
		System.out.println("car is stopped");
	}

	@Override
	public void accelerate() {
		System.out.println("car is accelerated");
	}

	@Override
	public void wash() {
		System.out.println("car is washing");
	}
}
