package com.oops.inheritance.upcasting.iportant3;

public class Util {

	
	// if there is a method of super type argument , then that method can be called for any subclass
	// instance.
	// here the drive()is having a Argument type of Car class that is super class to both BMW and 
	// Audi as well. so that method also can be called for all the sub class instances	od Car class.
	    public static void main(String[] args) {
		BMW_Car bc= new BMW_Car();
		Audi_Car ac= new Audi_Car();
		
		drive(bc);
	}
	
	static void drive(Car c)
	{
		//c.accelerate();
		//c.playMusic();
		// --> these two will give compile time error, bcz here c is a super type argument, 
		// and we already know using super type argument we can only access only super type members.
		// but here these 2 methods are in sub classes, so we need to do down caste.
		
		if(c instanceof BMW_Car)
			((BMW_Car) c).accelerate();
			
		if(c instanceof Audi_Car)
			((Audi_Car)c).playMusic();
		
		c.start();
		c.stop();
	}
}
