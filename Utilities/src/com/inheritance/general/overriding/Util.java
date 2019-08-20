package com.inheritance.general.overriding;

public class Util {

	public static void main(String[] args) {
		Animal a = new Snake();
		a.move();
		Animal a2 = new Human();
		a2.move();

	}

}
