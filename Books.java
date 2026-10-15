
import java.util.Scanner;

public class Books {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter available books: ");
        int available = sc.nextInt();

        System.out.print("Enter books to borrow: ");
        int borrow = sc.nextInt();

        System.out.println("\nStudent Name: " + name);

        if (borrow <= 0) {
            System.out.println("Invalid request");
        } else if (borrow <= available) {
            System.out.println("Request approved!");
            System.out.println("Books borrowed: " + borrow);
            System.out.println("Books remaining: " + (available - borrow));
        } else {
            System.out.println("Not enough books available");
        }

        sc.close();
    }
}
