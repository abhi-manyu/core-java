package com.oops.inheritance.upcasting.important4;

public class Cooker
{
    void cook(Vegitables veg)
    {
    	// when method is called, first it will check that if method is overridden or not ?
    	// if yes , then execution based on the instance type.
    	//if no, then normal execution, like which class it belongs to , that class 
    	//implementation will b executed
    	System.out.println(" i m in cooking");
    	veg.cook();
    	veg.steam();
    	veg.grinding();
    	// here all these 3 above methods are overridden, so based on the instance type , means if the veg 
    	// contains the instance of Potato class then then it will run potato class specific implementation
    	// or if veg contains instance of Bringal class, then it will run Bringal class specific 
    	// implementation
    	
    	// here we are still having a parent type reference, by that we can not refer sub class members.
    	// so we down casted according to our requirement
    	
    	if(veg instanceof Potato)
    		((Potato)veg).frying();
    	if(veg instanceof Bringal)
    		((Bringal)veg).soSoupCurry();
    }
}
