import java.time.*;
public class FitnessTracker
{
   private String activity;
   private int minutes;
   private LocalDate date;
   //constructor added for Exercise 3a
   //change this constructor to use this reference
   public FitnessTracker()
   {
      activity = "running";
      minutes = 0;
      date = LocalDate.of(2023, 1, 1);
   }
   public FitnessTracker(String act, int min, LocalDate dte)
   {
      activity = act;
      minutes = min;
      date = dte;
   }
   
   public String getActivity()
   {
      return activity;
   }
   public int getMinutes()
   {
      return minutes;
   }
   public LocalDate getDate()
   {
      return date;
   }
} 
