//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{

		Scanner keyboard = new Scanner(System.in);
		String response;
		

		do {

		//add in a do while loop after you get the basics up and running
		
			String player = "";
		
			out.print("Pick your weapon! [R,P,S] :: ");
			
			//read in the player value
			response = keyboard.next();
		
			RockPaperScissors game = new RockPaperScissors(response);	
			System.out.println(game.toString());
			
			out.print("Do you want to play again? ");
			
			response = keyboard.next();
			
		} while (!response.equals("n"));
	}
}



