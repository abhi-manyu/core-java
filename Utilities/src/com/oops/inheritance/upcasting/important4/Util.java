package com.oops.inheritance.upcasting.important4;

public class Util {

	// While calling a overridden method is called, then the implementation exicuted based on the instance
	// type.
	// details in Cooker class
	public static void main(String[] args) {
		
		// creating sub class instance and assigning it to super type variable is known as upcasting.
		/*so here either 'veg' contains Potato type or Bringal Type. so Based on that it will call the
		method of having super type argument.*/
		Vegitables vg= new Bringal();
		
		Cooker ck= new Cooker();
		ck.cook(vg);
	}
}
