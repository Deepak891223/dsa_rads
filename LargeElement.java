import java.util.Scanner;
public class LargeElement{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[] nums={1,4,6,7,9,};
        int Max=nums[0];
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]>Max)
            Max = nums[i];
           

        }
         System.out.println("Large Element is:"+Max);

        
    }
}