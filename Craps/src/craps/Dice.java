package craps;

public class Dice
{

	public static int dice()
	{
		
		double randomNumber = (int)(Math.random() * 10 + 1);
		int roll = (int) randomNumber;
		return(roll);
		
	}
	
}
