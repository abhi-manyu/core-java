package com.general.this_example.construstor;

public class Example {

	public static void main(String[] args) {
		Cube c1 = new Cube();
		Cube c2 = new Cube(45, 25, 36);
		Cube.display(c1);
		Cube.display(c2);
	}
}

class Cube
{
	int length;
	int breadth;
	int width;
	public Cube() {
		this(10);
		System.out.println("inside default constructor");
	}
	
	public Cube(int length, int breadth, int width)
	{
		this();
		this.length=length;
		this.breadth=breadth;
		this.width=width;
		System.out.println("inside 3 args construcor");
	}
	public Cube(int number)
	{
		length=breadth=width=number;
		System.out.println("inside single arg construcor");
	}
	
	public static void display(Cube c)
	{
		//System.out.println("[ length : "+length+" breadth : "+breadth+" width : "+width+" ]");
		System.out.println(c.length+"\t"+c.breadth+"\t"+c.width);
	}
}