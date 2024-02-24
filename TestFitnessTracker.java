import static java.lang.System.in;
import java.time.*;
import java.util.Scanner;

public class TestFitnessTracker
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(in);
            
      System.out.print("Enter Activity >> "); 
      String activity = input.nextLine(); 
      
      System.out.print("Enter minutes spent " + activity + ">> ");
      int mins = input.nextInt();
      
      System.out.print("Enter month >> ");
      int mon = input.nextInt();
      
      System.out.print("Enter day >> ");
      int day = input.nextInt();
      
      System.out.print("Enter year >> ");
      int yr = input.nextInt();
      
      
       
      FitnessTracker fit1 = new FitnessTracker();
        
       
      LocalDate dt = LocalDate.of(yr, mon, day);
      
      FitnessTracker fit2 = new FitnessTracker(activity, mins, dt);
         
      System.out.println(fit2.getActivity() + " " + fit2.getMinutes() + " minutes on " + fit2.getDate());
      System.out.println(fit1.getActivity() + " " + fit1.getMinutes() + " minutes on " + fit1.getDate());
   }
} // Write your code here
