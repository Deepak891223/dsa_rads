import java.util.Arrays;

public class MergeSort {

    static int[] mergeSort(int[] nums) {

        
        if (nums.length <= 1) {
            return nums;
        }

        int mid = nums.length / 2;

        int[] left = new int[mid];
        int[] right = new int[nums.length - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = nums[i];
        }

        for (int i = mid; i < nums.length; i++) {
            right[i - mid] = nums[i];
        }

        left = mergeSort(left);
        right = mergeSort(right);

        int[] result = new int[nums.length];

        int i = 0; 
        int j = 0;  
        int k = 0;  

       
        while (i < left.length && j < right.length) {

            if (left[i] <= right[j]) {
                result[k] = left[i];
                i++;
            } else {
                result[k] = right[j];
                j++;
            }

            k++;
        }

        
        while (i < left.length) {
            result[k] = left[i];
            i++;
            k++;
        }

       
        while (j < right.length) {
            result[k] = right[j];
            j++;
            k++;
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {38, 12, 27, 43, 9, 31, 18, 25};

        int[] sortedArray = mergeSort(nums);

        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(sortedArray));
    }
}