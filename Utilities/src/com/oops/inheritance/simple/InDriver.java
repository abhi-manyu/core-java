package com.oops.inheritance.simple;

public class InDriver {
  
	public static void main(String[] args) {
		CameraPhone cp = new CameraPhone();
		// accessing parent class methods
		cp.call();
		cp.sendSms();
		
		//accessing child class i.e it's own class methods
		cp.takePhoto();
		cp.shootVideo();
	}
}
