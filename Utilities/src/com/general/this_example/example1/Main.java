package com.general.this_example.example1;

class Main
{
	public static void main(String[] args) {
		
		Car c1= new Car("yellow");
		c1.display();
		Car c2= new Car("red");
		c2.display();
	}
}

class Car {

	String color;
	String name;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String color) {
		super();
		this.color = color;
	}
	public void display()
	{
		String color="white";
		System.out.println(color);
		System.out.println(this.color);
	}
}
