
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6};
        int n = 6;

        System.out.print("Missing numbers: ");

        for (int i = 1; i <= n; i++) {
            boolean found = false;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }

            if (found == false) {
                System.out.print(i + " ");
            }
        }
    }
}
