package craps;

import java.util.Scanner;

public class Craps
{

	public static void main(String[] args)
	{

		int roll1;
		int roll2;
		int rollSum;
		int rollOne = 0;
		int monney = 100;
		int bet;
		int checkBet;
		
		boolean wantToPlay;
		boolean gameFinished = false;
		boolean firstRoll = true;
		int betSucess;
		
		String userName;
		
		System.out.println("Welcome to Craps.");
		wantToPlay = askToPlay();
		
		if (wantToPlay == true)
		{
			
			userName = welcomePlayer();
			displayRules();
			
			while (wantToPlay == true)
			{
				
				bet = getBet(monney);
				
				while (gameFinished == false)
				{
					
					roll1 = rollDice();
					roll2 = rollDice();
					rollSum = addDice(roll1, roll2);
					betSucess = checkBet(firstRoll, rollSum, rollOne);
					
				}
				
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
	
	public static int getBet(int monney)
	{
		
		int bet;
		
		boolean validBet = false;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter bet ammount.");
		bet = input.nextInt();
		
		while (validBet = false)
		{
			
			if (bet <= monney && bet >= 0)
			{
			
				validBet = true;
				return(bet);
			
			}
			else
			{
			
				System.out.println("Invalid bet.");
				System.out.println("Enter new bet");
				bet = input.nextInt();
			
			}
			
		}
		return bet;
		
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
	
	public static int checkBet(boolean firstRoll, int rollSum, int rollOne)
	{
		
		if (firstRoll == true)
		{
			
			if (rollSum == 7 || rollSum == 11)
			{
				
				return(2);
			
			}
			else if (rollSum == 2 || rollSum == 12)
			{
				
				return(0);
				
			}
			else
			{
				
				return(1);
				
			}
			
		}
		else if (firstRoll == false)
		{
			
			if(rollSum == rollOne)
			{
				
				return(2);
				
			}
			else if (rollSum == 7)
			{
				
				return(0);
				
			}
			else
			{
				
				return(1);
				
			}
			
		}
		
	}

}
