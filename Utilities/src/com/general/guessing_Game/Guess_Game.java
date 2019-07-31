package com.general.guessing_Game;

import java.util.Scanner;

public class Guess_Game
{
	public static void main(String[] args)
	{
        int secret_code=45;
        int limit=0, max_limit=3;
        Scanner scn=new Scanner(System.in);
        while(limit<max_limit)
        {
        	System.out.print("guess the secret number : ");
            int number=scn.nextInt();
            if(number==secret_code)
            {
            	System.out.println("you won :) ");
            	break;
            }
            limit++;
        }
        if(limit>=max_limit)
     	   System.out.println("you lost the game");
	}

}
