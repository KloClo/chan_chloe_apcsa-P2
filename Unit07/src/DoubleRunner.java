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
		Scanner keyboard = new Scanner(in);
		
		out.print("Enter a number: ");
		double one = keyboard.nextDouble();
		
		out.print("Enter a second number: ");
		double two = keyboard.nextDouble();
		
		out.print("Enter a third number: ");
		double three = keyboard.nextDouble();
		
		out.print("Enter a fourth number: ");
		double four = keyboard.nextDouble();
		
		run.setDoubles(one, two, three, four);
		System.out.println("biggest = " + run.getBiggest() + "\n");

	}
}