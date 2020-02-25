package com.oops.inheritance.inherited_vars;

public class Util {

	public static void main(String[] args) {
		Parent p = new Parent();
		p.i=10;
		Child c = new Child();
		c.i=20;
		c.j=30;
		c.display();
		System.out.println(p.getClass());

	}

}
