package com.oops.interfaces.example2;

import com.oops.interfaces.example1.Washable;

public class BMW_car extends Car implements Washable
{

	@Override
	public void wash() {
		System.out.println("BMW cars can be easily washed");
	}

	public void playMusic() {
		System.out.println("BMW car's music is heaven");
	}
	
	@Override
	public void start() {
		System.out.println("BMW is started");
	}
	
	@Override
	public void stop() {
		System.out.println("BMW is stopped");
	}

}
