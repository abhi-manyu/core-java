package com.oops.abstracts.example1;

public class BMW_Car extends Car
{

	@Override
	void start() {
		System.out.println("BMW car is started");
	}

	@Override
	void stop() {
	System.out.println("BMW car is stopped");
	}
	
	void playMusic()
	{
		System.out.println("music is played in BMW car");
	}

}
