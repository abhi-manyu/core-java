package com.oops.interfaces.example1;

public class Audi_Car extends Car{

	@Override
	public void wash() {
		System.out.println("Audi is washing");

	}

	public void playMusic() {
		System.out.println("Audi is playing music");
	}
	
	@Override
	public void start() {
		System.out.println("Audi is started");
	}
	
	@Override
	public void stop() {
		System.out.println("Audi is stopped");
	}
	
	@Override
	public void accelerate() {
		System.out.println("Audi is accelerate");
	}

}
