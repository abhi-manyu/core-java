package com.oops.interfaces.example1;

public class BMW_car extends Car
{

	@Override
	public void wash() {
		System.out.println("BMW is washing");
	}

	public void playMusic() {
		System.out.println("BMW car is playing music");
	}
	
	@Override
	public void start() {
		System.out.println("BMW is started");
	}
	
	@Override
	public void stop() {
		System.out.println("BMW is stopped");
	}
	
	@Override
	public void accelerate() {
		System.out.println("BMW is accelerate");
	}

}
