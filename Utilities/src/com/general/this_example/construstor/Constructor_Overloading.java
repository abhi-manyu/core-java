package com.general.this_example.construstor;

public class Constructor_Overloading {

	public static void main(String[] args) {
		Box b1 = new Box(45, 23, 21);
		b1.display();
	}
}

class Box
{
	int length;
	int breadth;
	int width;
	public Box() {
		System.out.println("inside default constructor");
	}
	
	public Box(int length, int breadth, int width)
	{
		this.length=length;
		this.breadth=breadth;
		this.width=width;
		System.out.println("inside 3 args construcor");
	}
	public Box(int number)
	{
		length=breadth=width=number;
		System.out.println("inside single arg construcor");
	}
	
	public void display()
	{
		System.out.println("[ length : "+length+" breadth : "+breadth+" width : "+width+" ]");
	}
}