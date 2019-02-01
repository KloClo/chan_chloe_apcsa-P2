//© A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StarsAndStripes
{
   public StarsAndStripes()
   {
      System.out.println("StarsAndStripes");
      printTwoBlankLines();
   }

   public void printTwentyStars()
   {
	   int i = 20;
	   String line = "*";
	   while (i > 1) {
		   line = line+"*";
		   i = i - 1;
	   }
	   System.out.println(line);
   }

   public void printTwentyDashes()
   {
	   int i = 20;
	   String line = "-";
	   while (i > 1) {
		   line = line+"-";
		   i = i - 1;
	   }
	   System.out.println(line);
   }

   public void printTwoBlankLines()
   {
	   System.out.println();
	   System.out.println();
   }
   
   public void printASmallBox()
   {
	   printTwentyDashes();
	   printTwentyStars();
	   printTwentyDashes();
	   printTwentyStars();
	   printTwentyStars();
   }
 
   public void printABigBox()
   {
	   printTwentyStars();
	   printTwentyDashes();
	   printTwentyDashes();
	   printTwentyDashes();
	   printTwentyStars();
	   printTwentyDashes();
	   printTwentyStars();
	   printTwentyStars();
	   printTwentyDashes();
   }   
}