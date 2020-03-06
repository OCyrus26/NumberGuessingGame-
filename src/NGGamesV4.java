import java.util.Random;//import random
import java.util.Scanner;//import scanner

public class NGGamesV4 
{

	public static void main(String[] args) 
	{
		Random ran = new Random();
		Scanner scan = new Scanner (System.in);

		//variables
		int numTguess = ran.nextInt(10);
		int numOtries = 0;
		int userGuess = 0;
		
		do //do-while loop
		{
			System.out.println("Guess the random number, it's between 1 and 10: ");
			userGuess = scan.nextInt();
			numOtries++;

			if (userGuess == numTguess) //if number guess right print message and number of tries it took
			{
				System.out.println("You guess the right number: "+numTguess);
				System.out.println("Tries it took: "+numOtries);	
			}

			else if (userGuess != numTguess) // else if, if wrong number is guessed repeat 
			{
				System.out.println("Wrong guess, try again");
			}
		}
		while (userGuess != numTguess); //keeps loop going  as long as the number guessed is wrong 

	}
}
