package com.oops.inheritance.finals;

public abstract class Shape {

	private double length;
	private double width;
	
	public Shape(double length, double width)
	{
		this.length= length;
		this.width=width;
	}
	
	public final double getLength() {
		return length;
	}
	public double getWidth() {
		return width;
	}
	
	abstract double getArea();
}
