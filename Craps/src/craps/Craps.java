package craps;

import java.util.Scanner;

public class Craps
{

	public static void main(String[] args)
	{

		// variables

		int money = 1000;
		int bet;
		boolean play = true;
		boolean win;
		String username;

		// action

		username = welcomeUser();
		displayRules();
		
		while (play = true)
		{

			bet = placeBet(money);
			win = playCraps();
			money = betResults(win, money, bet);
			displayMoney(money);
			play = playAgain();

		}

	}

	public static String welcomeUser()
	{

		// variables

		String y = "y";
		String n = "n";
		String response;
		String username;
		Scanner input = new Scanner(System.in);

		// action

		System.out.println("Welcome to Craps.");
		System.out.println("Would you like to play? y or n.");
		response = input.nextLine();

		if (response.equals(y))
		{

			System.out.println("Enter a username.");
			username = input.nextLine();
			System.out.println("Welcome " + username + ".");

			return (username);

		} 
		else if (response.equals(n))
		{

			System.out.println("Goodbye.");
			System.exit(0);

		} 
		else
		{

			for (int i = 0; i <= 10; i++)
			{

				System.out.println("Alert! Alert!");
				System.out.println("Invaild input!");

			}

		}

		return ("");

	}

	public static void displayRules()
	{

		// variables

		String enterToContinue;
		Scanner input = new Scanner(System.in);

		// action

		System.out.println("\nRULES");
		System.out.println("You start with $1000 dollars of useless curency.");
		System.out.println("You can place a bet on whether or not you win the game.");
		System.out.println(
				"If you win you will recive an additional amount equal to your bet, but if you loose you loose an amount equal to your bet.");
		System.out.println("When the game starts, you roll two dice and add them together.");
		System.out.println(
				"If you roll a 7 or an 11 you automaticaly win, but if you roll a 2 or 12 you automaticay loose.");
		System.out.println(
				"If your roll equals anything else, you roll continuously unil you either get the same number, in which case you win, or until you get a 7, in which case you loose.");
		System.out.println("Press enter to continue.");
		enterToContinue = input.nextLine();

	}

	public static int placeBet(int maxBet)
	{

		// variables

		int bet;
		boolean vallidBet = false;
		String wantToBet;
		Scanner input = new Scanner(System.in);

		// action

		System.out.println("Enter a bet.");
		bet = input.nextInt();

		while (vallidBet == false)
		{
			
			if (bet >= 0 && bet <= maxBet)
			{

				vallidBet = true;
				return (bet);

			} 
			else
			{

				System.out.println("Invalid bet.");
				System.out.println("Enter a new bet.");
				bet = input.nextInt();

			}

		}

		return (0);

	}

	public static boolean playCraps()
	{

		// variables

		int firstRoll;
		int otherRoll;
		int rollPt1;
		int rollPt2;
		boolean end = false;
		String enterToRoll;
		Scanner input = new Scanner(System.in);

		// action

		System.out.println("Press enter to roll for the first time.");
		enterToRoll = input.nextLine();
		rollPt1 = rollDice();
		rollPt2 = rollDice();
		firstRoll = rollPt1 + rollPt2;
		System.out.println("You rolled a " + firstRoll + ".");

		if (firstRoll == 7 || firstRoll == 11)
		{

			return (true);

		} 
		else if (firstRoll == 2 || firstRoll == 12)
		{

			return (false);

		} 
		else
		{

			while (end == false)
			{

				System.out.println("Press enter to roll again.");
				enterToRoll = input.nextLine();
				otherRoll = 0;
				rollPt1 = rollDice();
				rollPt2 = rollDice();
				otherRoll = rollPt1 + rollPt2;
				System.out.println("You rolled a " + otherRoll + ".");

				if (otherRoll == firstRoll)
				{

					end = true;
					return (true);

				} else if (otherRoll == 7)
				{

					end = true;
					return (false);

				}

			}

		}
		
		return(false);

	}

	public static int betResults(boolean win, int money, int bet)
	{

		if (win == true)
		{

			System.out.println("Congrats you won! You win " + bet + " dollars.");
			money = money + bet;

		} 
		else if (win == false)
		{

			System.out.println("You lost! Haha. You lose " + bet + " dollars.");
			money = money - bet;

		}
		
		if (money == 0)
		{
			
			System.out.println("Sorry but you lost all your money, so you can't play anymore");
			System.out.println("Goodbye.");
			System.exit(0);
			
		}

		return (money);

	}
	
	public static void displayMoney(int money)
	{
		
		System.out.println("Now you have " + money + " dollars.");
		
	}

	public static boolean playAgain()
	{
		
		//variables
		
		String y = "y";
		String n = "n";
		String response;
		Scanner input = new Scanner(System.in);
		
		//action
		
		System.out.println("Would you like to play again? y or n.");
		response = input.nextLine();
		
		if (response.equals(y))
		{
			
			return (true);
			
		}
		else if (response.equals(n))
		{
			
			System.out.println("Thanks for playing, Goodbye.");
			System.exit(0);
			
		}
		else
		{
			
			System.exit(0);
			
		}
		
		return (false);
		
	}
	
	public static int rollDice()
	{

		double randomNumber = (int) (Math.random() * 6 + 1);
		int roll = (int) randomNumber;
		return (roll);

	}

}
