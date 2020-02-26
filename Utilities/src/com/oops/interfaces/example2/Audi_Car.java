package com.oops.interfaces.example2;

import com.oops.interfaces.example1.Washable;

public class Audi_Car extends Car implements Washable{

	@Override
	public void wash() {
		System.out.println("Audi cars can not be washed easily");

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
	
	public void accelerate() {
		System.out.println("Audi cars accelration is very good");
	}

}
