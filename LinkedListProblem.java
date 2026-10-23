
import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    double marks;
    Student next;

    Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        this.next = null;
    }
}

public class LinkedListProblem {
    static Student head = null;
    static Scanner sc = new Scanner(System.in);

    static Student createStudent() {
        System.out.print("Enter roll number: ");
        int roll = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks: ");
        double marks = sc.nextDouble();

        return new Student(roll, name, marks);
    }

    static void addBeginning() {
        Student s = createStudent();
        s.next = head;
        head = s;
        System.out.println("Student added successfully.");
    }

    static void addEnd() {
        Student s = createStudent();

        if (head == null) {
            head = s;
        } else {
            Student temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = s;
        }

        System.out.println("Student added successfully.");
    }

    static void insertPosition() {
        System.out.print("Enter position (starting from 1): ");
        int pos = sc.nextInt();

        if (pos < 1) {
            System.out.println("Invalid position.");
            return;
        }

        if (pos == 1) {
            addBeginning();
            return;
        }

        Student temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position.");
            return;
        }

        Student s = createStudent();
        s.next = temp.next;
        temp.next = s;

        System.out.println("Student inserted.");
    }

    static void deleteStudent() {
        System.out.print("Enter roll number to delete: ");
        int roll = sc.nextInt();

        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.rollNo == roll) {
            head = head.next;
            System.out.println("Student deleted.");
            return;
        }

        Student temp = head;

        while (temp.next != null &&
               temp.next.rollNo != roll) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Student not found.");
        } else {
            temp.next = temp.next.next;
            System.out.println("Student deleted.");
        }
    }

    static void searchStudent() {
        System.out.print("Enter roll number to search: ");
        int roll = sc.nextInt();

        Student temp = head;

        while (temp != null) {
            if (temp.rollNo == roll) {
                System.out.println("Student found:");
                System.out.println("Roll: " + temp.rollNo);
                System.out.println("Name: " + temp.name);
                System.out.println("Marks: " + temp.marks);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Student not found.");
    }

    static void display() {
        if (head == null) {
            System.out.println("No student records.");
            return;
        }

        Student temp = head;

        System.out.println("\n--- Student Records ---");
        while (temp != null) {
            System.out.println(
                "Roll: " + temp.rollNo +
                ", Name: " + temp.name +
                ", Marks: " + temp.marks
            );
            temp = temp.next;
        }
    }

    static void highestMarks() {
        if (head == null) {
            System.out.println("No student records.");
            return;
        }

        Student temp = head;
        Student topper = head;

        while (temp != null) {
            if (temp.marks > topper.marks) {
                topper = temp;
            }
            temp = temp.next;
        }

        System.out.println("Topper: " + topper.name);
        System.out.println("Roll number: " + topper.rollNo);
        System.out.println("Marks: " + topper.marks);
    }

    static void sortByMarks() {
        if (head == null || head.next == null) {
            System.out.println("Not enough records to sort.");
            return;
        }

        for (Student i = head; i.next != null; i = i.next) {
            for (Student j = i.next; j != null; j = j.next) {
                if (i.marks < j.marks) {
                    int r = i.rollNo;
                    i.rollNo = j.rollNo;
                    j.rollNo = r;

                    String n = i.name;
                    i.name = j.name;
                    j.name = n;

                    double m = i.marks;
                    i.marks = j.marks;
                    j.marks = m;
                }
            }
        }

        System.out.println("Students sorted by descending marks.");
    }

    static void countStudents() {
        int count = 0;
        Student temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        System.out.println("Total students: " + count);
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== Student Management System ===");
            System.out.println("1. Add at beginning");
            System.out.println("2. Add at end");
            System.out.println("3. Insert at position");
            System.out.println("4. Delete student");
            System.out.println("5. Search student");
            System.out.println("6. Display all students");
            System.out.println("7. Find topper");
            System.out.println("8. Sort by marks");
            System.out.println("9. Count students");
            System.out.println("0. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: addBeginning(); break;
                case 2: addEnd(); break;
                case 3: insertPosition(); break;
                case 4: deleteStudent(); break;
                case 5: searchStudent(); break;
                case 6: display(); break;
                case 7: highestMarks(); break;
                case 8: sortByMarks(); break;
                case 9: countStudents(); break;
                case 0:
                    System.out.println("Exiting program.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
