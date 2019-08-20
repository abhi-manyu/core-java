package com.inheritance.general.inherited_vars;

public class Util {

	public static void main(String[] args) {
		Parent p = new Parent();
		p.i=10;
		Child c = new Child();
		c.j=30;
		c.i=20;
		c.display();
		System.out.println(p.getClass().getSimpleName());

	}

}
