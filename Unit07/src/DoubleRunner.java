//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

import java.util.Scanner;

public class DoubleRunner
{
	public static void main(String[] args)
	{
		BiggestDouble run = new BiggestDouble(4.5,6.7,7.8,9.0);
		System.out.println(run);
		System.out.println("biggest = " + run.getBiggest() + "\n");

		//add more test cases
/*		Scanner keyboard = new Scanner(in);
		
		out.print("Enter a number: ");
		int one = keyboard.nextInt();
		
		out.print("Enter a number: ");
		int two = keyboard.nextInt();
		
		out.print("Enter a number: ");
		int three = keyboard.nextInt();
		
		out.print("Enter a number: ");
		int four = keyboard.nextInt();
		
		run.setDoubles(one, two, three, four);
		System.out.println("biggest = " + run.getBiggest() + "\n");*/

	}
}