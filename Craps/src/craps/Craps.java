package craps;

import java.util.Scanner;

public class Craps
{

	public static void main(String[] args)
	{

		int roll1;
		int roll2;
		int rollSum;
		int bet;
		
		boolean wantToPlay;
		
		String userName;
		
		System.out.println("Welcome to craps.");
		userName = welcomePlayer();
		wantToPlay = askToPlay();
		
		if (wantToPlay == true)
		{
			
			displayRules();
			
			while (wantToPlay == true)
			{
				
				bet = getBet();
				roll1 = rollDice();
				roll2 = rollDice();
				rollSum = addDice(roll1, roll2);
				
			}
			
		}
		else
		{
			
			System.out.println("Goodbye.");
			
		}

	}
	
	public static String welcomePlayer()
	{
		
		String userName;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a username.");
		userName = input.nextLine();
		System.out.println("Welcome " + userName + ".");
		
		return(userName);
		
	}
	
	public static boolean askToPlay()
	{
		
		boolean wantToPlay = false;
		
		String answer;
		String y = "y";
		String n = "n";
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Would you like to play? y or n.");
		answer = input.nextLine();
		
		if (answer.equals("y"))
		{
			
			wantToPlay = true;
			
		}
		else if (answer.equals("n"))
		{
			
			wantToPlay = false;
			
		}
		else
		{
			
			System.out.println("Invalid input.");
			
		}
		
		return (wantToPlay);
		
	}
	
	public static void displayRules()
	{
		
		System.out.println("Display rules here.");
		
	}
	
	public static int getBet()
	{
		
		bet
		
		return(bet);
		
	}
	
	public static int rollDice()
	{
		
		double randomNumber = (int)(Math.random() * 10 + 1);
		int roll = (int) randomNumber;
		return(roll);
		
	}
	
	public static int addDice(int roll1, int roll2)
	{

		return(roll1 + roll2);
		
	}

}
