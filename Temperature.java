// Temerature.java
// program declares an integer variable called option
// program declares three double variables, degree1, celsius1, and fahrenheit1
// Prompt the user to get the option. 
// If option is 1, program calculates the celsius, 
// if option is 2, program calculates the Fahrenheit, 
// if option is 3, program ends

import java.util.Scanner;

public class Temperature
{
   public static void main( String args[] )
   {
      int option;
      int degree1;
      int celsius1;
      int fahrenheit1;   
          
      Scanner input = new Scanner( System.in );

      System.out.printf( "%s\n%s\n%s\n", "1 for Fahrenheit to Celsius", 
            "2 for Celsius to Fahrenheit", "3 to quit:" );
      option = input.nextDouble();     
  
      if ( option != 1 )
      
         System.out.println( "Enter the degrees in Fahrenheit: " );
         degree1 = input.nextDouble(); 
     
         celsius1 = ( degree1 - 32 ) * 5 / 9; 
         System.out.printf( "The temp in Celsius is %d\n", celsius1 ); 
          
     if ( option = 2 );
     
            System.out.println( "Enter the degrees in Celsius: " );
            degree1 = input.nextDouble(); 
     
            fahrenheit1 = ( degree1 * 9 / 5 ) + 32;
            System.out.printf( "The temp in Fahrenheit is %d\n", fahrenheit1 ); 
      } 
   } // end method Main
} // end class Temperature
