import java.util.Scanner;

public class Sales {
   public void CalculateSales() {
      Scanner input = new Scanner(System.in);
      double[][] sales = new double[5][4];

      System.out.print("Enter sales person number (-1 to end): ");
      int person = input.nextInt();

      while (person != -1) {
         System.out.print("Enter product number: ");
         int product = input.nextInt();
         System.out.print("Enter sales amount: ");
         double amount = input.nextDouble();

         // error-check the input
         if (person >= 1 && person <= 4 && product >= 1 && product <= 5 && amount >= 0) {
            sales[product - 1][person - 1] += amount;
         } else {
            System.out.println("Invalid input!");
         }

         System.out.print("Enter sales person number (-1 to end): ");
         person = input.nextInt();
      } // end while

      // total for each salesperson
      double[] salesPersonTotal = new double[4];

      // display the table
      System.out.printf("%7s%14s%14s%14s%14s%10s\n", "Product", "Salesperson 1", "Salesperson 2",
            "Salesperson 3", "Salesperson 4", "Total");

      for (int row = 0; row < 5; row++) {
         double productTotal = 0.0;
         System.out.printf("%7d", (row + 1));

         for (int column = 0; column < 4; column++) {
            System.out.printf("%14.2f", sales[row][column]);
            productTotal += sales[row][column];
            salesPersonTotal[column] += sales[row][column];
         } // end for

         System.out.printf("%10.2f\n", productTotal);
      } // end for

      System.out.printf("%7s", "Total");

      for (int column = 0; column < 4; column++)
         System.out.printf("%14.2f", salesPersonTotal[column]);

      System.out.println();
   } // end method calculateSales

   public static void main(String[] args) {
      Sales salesCalculator = new Sales();
      salesCalculator.CalculateSales();
   }
} // end class Sales
