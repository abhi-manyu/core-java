package com.oops.inheritance.upcasting.important;

public class Util {

	public static void main(String[] args) {
		/*Child c=new Child();
		c.displayChild();
		c.displayParent();*/
		
		/*Parent p= new Parent();
		p.displayParent();*/
		
		Parent p= new Child();
		p.displayParent();
		((Child)p).displayChild();

	}

}
