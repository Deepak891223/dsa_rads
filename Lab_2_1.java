import java.util.*;
class Lab_2_1{
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in)
        int n = sc.nextInt();
        int[] stack = new int[n];
        int[] even = new int[n];
        int[] odd = new int[n];
        for(int i=0;i<n;i++){
            stack[i] = sc.nextInt();
        }
        int e=0;
        int o = 0;
        while(n>0){
            int x = stack[--n];
            if(x%2==0){
                even[e++]=x;
            }else{
                odd[o++]=x;
            }
        }
         System.out.print("Even: ");
        if (e == 0)
            System.out.println("-1");
        else {
            for (int i = e - 1; i >= 0; i--)
                System.out.print(even[i] + " ");
            System.out.println();
        }

        System.out.print("Odd: ");
        if (o == 0)
            System.out.println("-1");
        else {
            for (int i = o - 1; i >= 0; i--)
                System.out.print(odd[i] + " ");
            System.out.println();
        }

        sc.close();
    }
}