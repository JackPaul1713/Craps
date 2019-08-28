package craps;

public class Craps
{

	public static void main(String[] args)
	{

		int roll1;
		int roll2;
		int rollSum;
		
		roll1 = dice(roll1, roll2);
		roll2 = dice();

	}
	
	public static int dice()
	{
		
		double randomNumber = (int)(Math.random() * 10 + 1);
		int roll = (int) randomNumber;
		return(roll);
		//stedthedrtyhedrthedrth
	}
	
	public static int diceSum()
	{

		int roll1;
		int roll2;
		return(roll1 + roll2);
		
		//Test
		
	}

}
