package com.oops.inheritance.upcasting.important2;

public class Util {

	//using the parent class reference only parent specific methods and variables can be accessed
	public static void main(String[] args) {
		Parent p= new Parent();
		p.test1();
		//p.test2();
		//p.test3();  ->  compile time error, cuz with super type reference we only can refer super specific 
		// methods and variables. Here p is Parent specific . so we can not use it to refer test2() and 
		// test3() methods those are present in the child classes
		
		Child1 ch= new Child1();
		ch.test1();
		ch.test2();
		//ch.test3(); --> error , here ch is child to Parent class hence test1() is available to this class as well
		// but being parent to the child2 class , we can not access 
	}
}
