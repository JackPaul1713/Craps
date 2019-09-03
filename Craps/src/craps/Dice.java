package craps;

public class Dice
{

	public static int dice()
	{
		
		double randomNumber = (int)(Math.random() * 6 + 1);
		int roll = (int) randomNumber;
		return(roll);
		
	}
	
}
