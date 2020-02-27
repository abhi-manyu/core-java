package com.oops.inheritance.hashCode;

public class Util {

	//Here in all only one object is created,though their has code is same for both
	// but while printing the class name, it is showing the child class name bcz , internally,
	// it is creating like Fruits ap = new Apple();
	// so only on e Apple object is created and can be referred by Fruit as well.
	public static void main(String[] args) {
		Fruits ap = new Apple();
	}
}
