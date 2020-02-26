package com.oops.interfaces.example2;

public abstract class Car implements Drivable
{

	@Override
	public void start() {
		System.out.println("car is started");
	}

	@Override
	public void stop() {
		System.out.println("car is stopped");
	}
}
