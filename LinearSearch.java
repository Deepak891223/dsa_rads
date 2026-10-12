import java.util.Scanner;
public class LinearSearch{
    public static void main(String[] args) {
        int []nums = {10,30,40,50,60};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        for(int i=0;i<nums.length;i++){
            if(target == nums[i])
            System.out.println("index: "+i);
        }
    }
}