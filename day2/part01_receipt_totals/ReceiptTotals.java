package day2.part01_receipt_totals;

public class ReceiptTotals {

    public static void main(String[] args) {
        printReceiptSummary();
        printClosingCountdown();
    }

    // Scenario:
    // A store sold items numbered 100 through 105.
    // Each item costs $5.
    // Every 3rd item starting at 100 is on sale for $3 instead.
    // - Calculate and print the total cost.
    // - Do NOT hard-code the total.
    public static void printReceiptSummary() {
        int total = 0; 
        // Loop through all the items from 100 to 105.
        for (int item = 100; item <= 105; item++) {
            if ((item-100)% 3 == 0) {
                total += 3;
            } else {
                total += 5;
            }
        }
        System.out.println("Total: $" + total);

    }

    
    // Print a countdown from 5 down to 0 on one line.
    public static void printClosingCountdown() {
        int total = 5; 
        for (int item = 5; item >= 0; item--) {
            System.out.print(item + " ");
        
        }
        System.out.println();
    }
    
}
