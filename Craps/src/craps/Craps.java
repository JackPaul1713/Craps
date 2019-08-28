package craps;

public class Craps
{

	public static void main(String[] args)
	{

		int roll1;
		int roll2;
		int rollSum;
		
		
		roll1 = rollDice();
		roll2 = rollDice();

	}
	
	public static String welcomePlayer()
	{
		
		String(userName);
		return(userName);
		
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
