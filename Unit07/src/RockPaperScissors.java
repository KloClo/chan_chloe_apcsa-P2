//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		playChoice = "";
		compChoice = "";
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		playChoice = player.toUpperCase().trim();
		
		int num = (int)(Math.random()*3);
		
		if (num == 0) {
			compChoice = "R";
		}
		else if (num == 1) {
			compChoice = "P";
		}
		else if (num == 2) {
			compChoice = "S";
		}
	}

	public String determineWinner()
	{
		String winner="";
		
		if (playChoice.equals(compChoice)) {
			winner = "Draw";
		}
		else if ((playChoice.equals("R") && compChoice.equals("S"))
				|| (playChoice.equals("S") && compChoice.equals("P"))
				|| (playChoice.equals("P") && compChoice.equals("R")))
		{
			winner = "Player";
		}
		else 
		{
			winner = "Computer";
		}
		
		//give all cases above
		
		return winner;
	}

	public String toString()
	{
		String play = "";
		String comp = "";
		
		if (playChoice.equals("P")) {
			play = "Paper";
		}
		else if (playChoice.equals("R")) {
			play = "Rock";
		}
		else {
			play = "Scissors";
		}
		
		if (playChoice.equals("P")) {
			comp = "Paper";
		}
		else if (playChoice.equals("R")) {
			comp = "Rock";
		}
		else {
			comp = "Scissors";
		}
		
		String output="Player chose "+playChoice+"\nComputer chose "+compChoice;
		
		if (determineWinner().equals("Draw")) {
			output = output + "\nThe game is a draw!";
		}
		else {
		output = output + "\nThe winner is " + determineWinner();
		}
		
		return output;
	}
}