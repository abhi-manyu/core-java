package com.methods;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		System.out.println("lets open an account for u");
		System.out.println("please enter ur initial account balance u want to diposite");
		Scanner scn= new Scanner(System.in);
		int acc_Bal = scn.nextInt();
		System.out.println("please enter ur security pin for ur account");
		int security_pin = scn.nextInt();
		Account acc1= new Account(acc_Bal, security_pin);
		String result=null;
		do
		{
			System.out.println("please enter ur choice : 1:\t diposite balance\n\t\t\t 2:\t withdraw Balance");
			int choice = scn.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("please  enter ur amount u want to diposite : ");
				int amount= scn.nextInt();
				acc1.diposite_Balance(amount);
				break;
			case 2:
				acc1.withdraw_Balancce();
				break;
			default:
				System.out.println("please enter a valid choice : ");
			}
			System.out.println("please type \"yes\" - continue \n\t \"no\" - exit ");
			result = scn.next();
		}while(result.equalsIgnoreCase("yes"));
		scn.close();
	}
}


class Account{
	int acc_bal;
	int security_Pin;
	
	public Account() {
		
	}

	public Account(int acc_bal, int security_Pin) {
		super();
		this.acc_bal = acc_bal;
		this.security_Pin=security_Pin;
	}
	
	public void diposite_Balance(int amount)
	{
		int counter = 0;
		while(counter<3)
		{
		System.out.println("enter ur security pin : ");
		Scanner scn= new Scanner(System.in);
		int sec_pin=scn.nextInt();
		if(security_Pin==sec_pin)
		{
			acc_bal+=amount;
			System.out.println("thank you, ur money has been diposited successfully \n"
					+ "current balance is : "+acc_bal);
			break;
		}
		else
		{
			System.out.println("u have entered an incorrect pin");
			counter++;
			if(counter>=3)
			{
				System.out.println("u have exceeded the maximum trying limit for today, "
						+ "plz try gain on tomorrow\t THANK YOU");
				System.exit(0);
			}
		}
	  }
	}
	
	public void withdraw_Balancce()
	{
		int counter=0;
		do {
		Scanner scn= new Scanner(System.in);
		System.out.println("please enter the amount u want to withdraw");
		int amount = scn.nextInt();
		System.out.println("please enter ur security pin : ");
		int sec_pin= scn.nextInt();
		if(security_Pin==sec_pin)
		{
			if(amount<=acc_bal)
			{
				acc_bal-=amount;
				System.out.println("thank you ur current acount balance is : "+acc_bal);
				break;
			}
			else
				System.out.println("\"insufficient balance\"please type an amount less than ur current account balance");
		}
		else
		{
			System.out.println("u have entered a incorrect pin");
			counter++;
			if(counter>=3)
			{
				System.out.println("u have exceeded the maximum trying limit for today, "
						+ "plz try gain on tomorrow\t THANK YOU");
				System.exit(0);
			}
		}
	  }
		while(true);
	}
}