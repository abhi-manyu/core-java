package com.java8.lambda.simple.stiring;

public class Stringlength {

	public static void main(String[] args) {
		
		//how to find out length of a string in lambda expression
		String s="hello world";
		// in java 7
		System.out.println(s.length());
		
		
		// in java 8
		//s->System.out.println(s.length());
		//or
		//int length=s -> s.length();
	}
}
