import java.util.*;

class Lab_3_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Queue<String> q = new LinkedList<>();
        q.add("1");

        System.out.println("Binary numbers from 1 to " + n + " are:");

        for (int i = 1; i <= n; i++) {
            String s = q.poll();
            System.out.println(s);

            q.add(s + "0");
            q.add(s + "1");
        }
    }
}
