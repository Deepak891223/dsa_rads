
public class QuickSort {

    // Quick Sort method
    static void quickSort(int[] arr, int low, int high) {

        if (low < high) {

            int pi = partition(arr, low, high);

            // Recursion: sort left part
            quickSort(arr, low, pi - 1);

            // Recursion: sort right part
            quickSort(arr, pi + 1, high);
        }
    }

    // Partition method
    static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot in its correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // Main method
    public static void main(String[] args) {

        int[] arr = {40, 20, 10, 80, 60, 50, 7, 30};

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
