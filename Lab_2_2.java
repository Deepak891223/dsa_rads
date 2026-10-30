
import java.util.Scanner;
import java.util.Stack;

class Lab_2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        Stack<Integer> st = new Stack<>();

        for (String x : s) {
            if (x.equals("+") || x.equals("-") ||
                x.equals("*") || x.equals("/")) {

                if (st.size() < 2) {
                    System.out.println(-1);
                    return;
                }

                int b = st.pop();
                int a = st.pop();

                switch (x) {
                    case "+": st.push(a + b); break;
                    case "-": st.push(a - b); break;
                    case "*": st.push(a * b); break;
                    case "/": st.push(a / b); break;
                }
            } else {
                try {
                    st.push(Integer.parseInt(x));
                } catch (Exception e) {
                    System.out.println(-1);
                    return;
                }
            }
        }

        if (st.size() == 1)
            System.out.println(st.pop());
        else
            System.out.println(-1);

        sc.close();
    }
}
