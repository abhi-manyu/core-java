package com.oops.inheritance.upcasting.important4;

public class Bringal extends Vegitables {

	void soSoupCurry()
	{
		System.out.println("this way bringal can be more tastier");
	}
	@Override
	void cook()
	{
		System.out.println("Bringals are being cooked up");
	}
	@Override
	void steam()
	{
		System.out.println("Bringals are being steamed , so that that they can be more delicious");
	}
	
	@Override
	void grinding()
	{
		System.out.println("Bringals are being grinded, so that they can be consumed more easily");
	}
}
