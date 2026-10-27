public class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 3, 4, 6, 7};

        int n = a.length;
        int m = b.length;

        int[] c = new int[n < m ? n : m];

        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (a[i] < b[j]) {
                i++;
            } else if (a[i] > b[j]) {
                j++;
            } else {
                if (k == 0 || c[k - 1] != a[i]) {
                    c[k] = a[i];
                    k++;
                }
                i++;
                j++;
            }
        }

        for (int x = 0; x < k; x++) {
            System.out.print(c[x] + " ");
        }
    }
}