package com.general.ConstructorChainning;

public class Driver
{
	public static void main(String[] args)
	{
		Rectangle rec1=new Rectangle();
		Rectangle rec2=new Rectangle(5);
		Rectangle rec3=new Rectangle(20,10,40);
		Rectangle rec4=new Rectangle(rec3);
		rec1.displayRectangle();
		rec2.displayRectangle();
		rec3.displayRectangle();
		rec4.displayRectangle();
	}

}
