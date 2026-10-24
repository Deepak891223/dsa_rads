import java.util.Scanner;

class Queue {
    int id;
    String name;

    Patient(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Main {
    static Patient[] queue = new Patient[5];
    static int front = -1;
    static int rear = -1;

    static void enqueue(Scanner sc) {
        if (rear == queue.length - 1) {
            System.out.println("Queue is full!");
            return;
        }

        System.out.print("Enter patient ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter patient name: ");
        String name = sc.nextLine();

        Patient p = new Patient(id, name);

        if (front == -1) {
            front = 0;
        }

        queue[++rear] = p;

        System.out.println("Patient added successfully.");
    }

    static void dequeue() {
        if (front == -1) {
            System.out.println("Queue is empty!");
            return;
        }

        System.out.println("Treating patient: "
                + queue[front].name);

        if (front == rear) {
            front = rear = -1;
        } else {
            front++;
        }
    }

    static void peek() {
        if (front == -1) {
            System.out.println("No patients waiting.");
        } else {
            System.out.println("Next patient: "
                    + queue[front].name
                    + " (ID: " + queue[front].id + ")");
        }
    }

    static void display() {
        if (front == -1) {
            System.out.println("Queue is empty!");
            return;
        }

        System.out.println("Waiting patients:");

        for (int i = front; i <= rear; i++) {
            System.out.println(
                    "ID: " + queue[i].id
                    + ", Name: " + queue[i].name);
        }
    }

    static void count() {
        if (front == -1) {
            System.out.println("Total waiting patients: 0");
        } else {
            System.out.println(
                    "Total waiting patients: "
                    + (rear - front + 1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Hospital Queue ---");
            System.out.println("1. Add Patient");
            System.out.println("2. Treat Patient");
            System.out.println("3. Next Patient");
            System.out.println("4. Display Queue");
            System.out.println("5. Count Patients");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    enqueue(sc);
                    break;

                case 2:
                    dequeue();
                    break;

                case 3:
                    peek();
                    break;

                case 4:
                    display();
                    break;

                case 5:
                    count();
                    break;

                case 6:
                    System.out.println("Program terminated.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}