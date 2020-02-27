package com.oops.interfaces.multipleInheritance;

public class Driver {

	public void drive(Veichle v)
	{
		v.start();
		v.stop();
		v.playMusic();
		
		//normal static methods can be accessible by objectName. method name, but static method defined in
		//interface ca only be accessed by className.methodName().
		Veichle.soundHorn();
	}
}
