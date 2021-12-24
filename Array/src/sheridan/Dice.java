package sheridan;
import java.util.Random;
/*
 * @author Akshay Ghatge
 *
 */
public class Dice
{
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		//declaration and initialization

		int[] dice=new int[1000];//  array of size 1000
		Random random=new Random();
		int count;

		//for loop used to repeat the roll for 1000 times
		for(int roll=0;roll<1000;roll++)
		{
			int firstDice=random.nextInt(6)+1;

			int secondDice=random.nextInt(6)+1;

			count=firstDice+secondDice;
			dice[count]+=1;
		}
		//for loop used to loop for displaying result
		for(int index=2;index<=12;index++)
		{
			System.out.println("Dice count "+index+" : "+dice[index]+" times");
		}

	}
}//end of main method