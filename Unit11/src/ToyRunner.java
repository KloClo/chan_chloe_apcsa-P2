//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import java.util.Scanner;

public class ToyRunner
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(in);
		ToyStore test = new ToyStore();

		out.print("Enter a list of toys, separated by spaces: ");
		
		while (keyboard.hasNext()) 
		{
			String toy = keyboard.next();
			test.loadToys(toy);
			System.out.println("loaded");
		} 
		

		System.out.println("hello");


	}
}