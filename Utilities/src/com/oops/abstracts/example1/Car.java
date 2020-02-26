package com.oops.abstracts.example1;

public abstract class Car {
	
	// here this is an Abstract class

	// abstract methods has been used over here,when the behaviour is known
	//but the implementation is unknown, then go for abstract methods. so here we know every car can have
	// possible have start and stop methods, but how they will implement it , that totally depends on them.
	abstract void start();
	abstract void stop();
}
