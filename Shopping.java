
import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] names = new String[n];
        double[] prices = new double[n];
        int[] quantities = new int[n];

        double subtotal = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for product " + (i + 1));

            System.out.print("Product name: ");
            names[i] = sc.nextLine();

            System.out.print("Price: ");
            prices[i] = sc.nextDouble();

            System.out.print("Quantity: ");
            quantities[i] = sc.nextInt();
            sc.nextLine();

            subtotal += prices[i] * quantities[i];
        }

        double discount = 0;

        if (subtotal >= 5000) {
            discount = subtotal * 0.10;
        }

        double discountedAmount = subtotal - discount;
        double gst = discountedAmount * 0.05;
        double finalAmount = discountedAmount + gst;

        System.out.println("\n========== SHOPPING BILL ==========");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-12s %.2f x %d = %.2f%n",
                names[i], prices[i], quantities[i],
                prices[i] * quantities[i]);
        }

        System.out.printf("%nSubtotal:       %.2f%n", subtotal);
        System.out.printf("Discount:       %.2f%n", discount);
        System.out.printf("GST (5%%):       %.2f%n", gst);
        System.out.println("-----------------------------------");
        System.out.printf("Final Amount:   %.2f%n", finalAmount);

        sc.close();
    }
}
