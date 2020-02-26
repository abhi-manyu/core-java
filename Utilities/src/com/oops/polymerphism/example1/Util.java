package com.oops.polymerphism.example1;

public class Util {

	public static void main(String[] args) {
		
		// here come polymerphism concept.
		// the same methods are behaving differently according to different situation.
		
		Rider r= new Rider();
		
		//case 1 : --> 
		//BIke b =new BIke();
		//here we are creating Bike object and also assigning it to bike type reference.
		// so as we know, when overloaded ride() method of Rider class will be called, it will determine
		// which type is the instance b is ?. then according to it will go to that implementation.
		// here it is Bike type , so it will go to  ride(Bike b) method, this is compile time polymerphism.
		// and from there, though start method is overloaded, it will call start method of the instance type
		// as here b holds a Bike type instance, then it will call stat() method of Bike class
		
		
		//Case 2:  -->
		//Pulser p = new Pulser();
		// here also, same thing, first it will dettermine the type  of the obeject p, here it is Pulsar type
		// so by compile time polymerphsim, it will go to ride() of Pulsar type. and then there again will
		// decide the instance type, it will go to that implementaion type, so here start() method of 
		// pulsar type will be executed.
		
		// case 3: -->
		BIke b =new Pulser();
		// here what happens is , we did upcasting , means created a pulsar type object and assigned it to 
		// Bike type. But same rules applied here as well.
		// According to Compile time polymerphism, it first decides which overloaded method sholud be 
		//called based on the argument type, so here 'b' is Bike type. so it will call ride(Bike b) method
		// then from there , again it will decide the instance type, so here instance type is pulsar type
		// so start() method of Pulsar type will be called and executed
		
		r.ride(b);
	}

}
