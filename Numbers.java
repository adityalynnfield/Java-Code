// Numbers.java
// Program prompts user to get first number and second number
// Then the program displays first number and second number 

import static java.lang.System.in;
import java.util.Scanner;

public class Numbers 
{
   public static void main(String[] arg)
   {
      Scanner input = new Scanner(in);

      int firstNumber; 
      int secondNumber;

      System.out.print("Enter first number: "); // prompt for input
      firstNumber = input.nextInt(); // read first number

      System.out.print("Enter second number: "); // prompt for input
      secondNumber = input.nextInt(); // read second number

      System.out.println("The first number is " + firstNumber);
      
      System.out.println("The second number is " + secondNumber);
   } // end main
} // end class 


