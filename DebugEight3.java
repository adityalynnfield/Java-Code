import java.util.Scanner;

public class DebugEight3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String entry;
        char[] floorPlans = {'A', 'B', 'C', 'a', 'b', 'c'};
        int[] pricesInThousands = {145, 190, 235};
        char plan;
        int x, fp = 99;

        System.out.println("Please select a floor plan");
        System.out.println("Our floor plans are:");
        System.out.println("   A - Augusta, a ranch");
        System.out.println("   B - Brittany, a split level");
        System.out.println("   C - Colonial, a two-story");
        System.out.print("Enter floor plan letter >> ");
        entry = input.nextLine();
        plan = entry.toUpperCase().charAt(0); // Convert to uppercase for case-insensitive comparison

        for (x = 0; x < floorPlans.length; ++x) {
            if (plan == floorPlans[x]) {
                fp = x % 3; // Use modulo to get the correct index for prices
                break; // Terminate the loop once a match is found
            }
        }

        if (fp == 99) {
            System.out.println("Invalid floor plan code entered");
        } else {
            System.out.println("Model " + plan +
                    " is priced at only $" +
                    pricesInThousands[fp] + ",000");
        }
    }
}
