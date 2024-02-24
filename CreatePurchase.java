import java.util.Scanner;

public class CreatePurchase {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String invoiceNumber;
        do {
            System.out.print("Enter invoice number (between 1000 and 8000): ");
            invoiceNumber = input.nextLine();
        } while (!isValidInvoiceNumber(invoiceNumber));

        
        double saleAmount;
        do {
            System.out.print("Enter sale amount (nonnegative): $");
            saleAmount = input.nextDouble();
        } while (saleAmount < 0);

        
        Purchase purchase = new Purchase(invoiceNumber, saleAmount);
        purchase.display();
                
    }
    private static boolean isValidInvoiceNumber(String invoiceNumber) {
        try {
            int number = Integer.parseInt(invoiceNumber);
            return number >= 1000 && number <= 8000;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
