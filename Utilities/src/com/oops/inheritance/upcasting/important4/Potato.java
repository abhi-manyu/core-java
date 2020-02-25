package com.oops.inheritance.upcasting.important4;

public class Potato extends Vegitables {

	void frying()
	{
		System.out.println("potatos are being fried, we all love this");
	}
	
	@Override
	void cook()
	{
		System.out.println("Potatos are being cooked up");
	}
	@Override
	void steam()
	{
		System.out.println("Potatos are being steamed , so that that they can be more delicious");
	}
	
	@Override
	void grinding()
	{
		System.out.println("Potatos are being grinded, so that they can be consumed more easily");
	}
}
