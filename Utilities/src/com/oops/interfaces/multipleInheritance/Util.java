package com.oops.interfaces.multipleInheritance;

public class Util {

	public static void main(String[] args) {
		Bus b= new Bus();
		Car c = new Car();
		Driver d = new Driver();
		d.drive(c);
	}

}
