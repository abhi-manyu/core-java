package com.oops.abstracts.example1;

public class Util {

	public static void main(String[] args) {
		/*BMW_Car bm= new BMW_Car();
		Audi_Car ad = new Audi_Car();*/
		
		// also we can do this as well
		Car c = new BMW_Car();
		
		Driver d= new Driver();
		d.drive(c);
	}

}
