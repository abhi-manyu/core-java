package com.oops.interfaces.multipleInheritance;

public interface Veichle
{
	// here veichle is an inerface so by default whatever the methods defined are abstract and public
	// so that implementation can be provided by implemented class
	// but suppose we want to add a new method into the interface, then again we need to change all existing
	// implemented class as well, so for avoiding this from java 8 and later one  default method is 
	// introduced so that we can write any other method without affecting existing implementing classes.
	
	// even we also can declare and write implementation for static classes as well,  and can access the 
	// method by calling as InterfaceName.methodname
   void start();
   void stop();
   
   default void playMusic()
   {
	   System.out.println("music system should be there in every veichle");
   }
   
   public static void soundHorn()
   {
	   System.out.println("veichle should positively sound horns");
   }
}
