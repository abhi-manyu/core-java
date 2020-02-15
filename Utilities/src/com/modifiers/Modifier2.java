package com.modifiers;

public class Modifier2
{
	public static void main(String[] args) {
		System.out.println("i m in main method of Modifier2 class");
		try {
			Class.forName("Modifier1.class");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

// why the ClassNotFoundException is coming ?
class Modifier1 {
	static {
		System.out.println("in static block of Modifier1 class");
	}
    public static void main(String[] args) {
		System.out.println("i m in maun method of Modifier1 class");
	}
}

