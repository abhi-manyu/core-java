package com.oops.inheritance.inherited_vars;

class ChildTest extends ParentTest
{
	public static void main(String[] args) {
		ChildTest ct = new ChildTest();
		ct.display();
	}
   public void display()
   {
	   System.out.println("the value of the private number in parent classs is : ");
   }
}
