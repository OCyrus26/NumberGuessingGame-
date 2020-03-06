import java.util.Random;
import java.util.Scanner;

public class NGGamesV2
{

	public static void main(String[] args)
	{
		Random ran = new Random();
		Scanner scan = new Scanner (System.in);

		int numTguess = ran.nextInt(10);
		int numOtries = 0;
		int userGuess = 0;

		while (userGuess != numTguess)
		{

			System.out.println("Guess the random number, it's between 1 and 10: ");
			userGuess = scan.nextInt();

			if (userGuess == numTguess)
			{
				System.out.println("You guess the right number: "+numTguess);
			}

			else if (userGuess != numTguess)
			{
				System.out.println("Wrong guess, try again");
			}
		}
	}

}
