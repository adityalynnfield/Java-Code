// Average.java
// Program is gettign two double numbers 
// Program calls different methods to calculate the minimum, maximum, sum, 
// and average of the two numbers

import java.util.Scanner;

public class Average
{
   public static void main(String args[])
   {
      Scanner input = new Scanner( System.in );

      System.out.println( "Please enter the number" );  
      double number1 = input.nextInt();

      System.out.println( "Please enter another number" );  
      double number1 = in.nextDouble();
      
      double newMaximum = maximum( number1, number2 );
      double newminimum = minimum( number, number2 ); 
      double sum1 = sum(number1, number2);
      double average1 = average( sum ); 


      System.out.printf( "The maximum: %.2f\nThe minimum: %.2f\nThe sum: %.2f\nThe average: %.2f\n", 
         newMaximum, newMinimum, sum1, average1 );
   } // end method main
} // end class Average

public static double sum(double x, int y)
{
	return x + y;
}	// end method sum

public double average( double x );
{
   return x / 2; 
} // end method average

public static double maximum( double x, double y )
{
   Math.max( x, y ); 
} // end method maximum

public double minimum( double x, int y )
{
   return min( x, y );
} // end method minimum