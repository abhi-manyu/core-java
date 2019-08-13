package com.general.ConstructorChainning;

public class Rectangle {
    
	int length;
	int breadth;
	int height;
	public Rectangle()
	{
		
	}
	public Rectangle(int number)
	{
		this(number,number);
	}
	public Rectangle(int number1,int number2)
	{
		this(number1,number2,20);
	}
	public Rectangle(int number1, int number2, int number3)
	{
		length=number1;
		breadth=number2;
		height=number3;
	}
	public Rectangle(Rectangle rect)
	{
		length=rect.length;
		breadth=rect.breadth;
		height=rect.height;
		
	}
	public void displayRectangle()
	{
		System.out.println("[ "+length+" : "+breadth+" : "+height+" ]");
	}
}
