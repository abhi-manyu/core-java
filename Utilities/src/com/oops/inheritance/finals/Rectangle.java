package com.oops.inheritance.finals;

public class Rectangle extends Shape {

	public Rectangle(double length, double width) {
		super(length, width);
	}
	
	@Override
	final double getArea() {
		return this.getLength() * this.getWidth();
	}

}
