package Pack1;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
	Scanner scan=new Scanner(System.in);
	Random random=new Random();
	public void m1()
	{
		int number=random.nextInt(100)+1;
		System.out.println("Welcome to the Number Guessing Game");
		System.out.println("I have selected a number between 1 and 100. Can you guess it?");
		System.out.println("You have 5 Attempts to Guess Number");
		int attempt=5;
		int rg=0;
		while(rg!=number &&attempt>0)
		{
			System.out.println("Enter your guess:");
			
			rg=scan.nextInt();
			attempt--;
			if(rg>number)
			{
				System.out.println("your guess  is Too High: Try again");
				
			}
			else if(rg<number)
			{
				System.out.println("your guess  is Too Low: Try again");
				
			}
			else {
				 System.out.println("Congratulations! You guessed the number " + number + " correctly.");
				 System.out.println("It took you " + attempt + " attempts.");

			}
			 if (attempt == 0 ) {
			        System.out.println("Sorry! You've used all attempts. The correct number was " + number + ".");
			    } else {
			        System.out.println("Remaining attempts: " + attempt);
			        
			        
			    }
			
			
			}
		m2();
	       
		
		
		
		
}
	public void m2()
	{
		System.out.println("Do you want to play again: enter yes/no");
		 scan.nextLine();
		String s1=scan.nextLine();
		if (s1.equalsIgnoreCase("yes"))

		{
			m1();
		}
		else
		{
			System.out.println("thankyou");
		}
		
	}
	public static void main(String[]args)
	{
		 NumberGuessingGame obj=new  NumberGuessingGame();
		 obj.m1();
		 
		
	}
	
}