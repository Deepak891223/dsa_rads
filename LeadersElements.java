class LeadersElements {
    public static void main(String[] args) {
        int[] arr = {10, 22, 12, 3, 0, 6};

        System.out.println("Leader elements are:");

        for (int i = 0; i < arr.length; i++) {
            int j;

            for (j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    break;
                }
            }

            if (j == arr.length) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}