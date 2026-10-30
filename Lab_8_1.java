import java.util.*;
class Lab_8_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<int[]> pq =new PriorityQueue<>((a,b)->b[1]-a[1]);
        while (true) { 
            int id = sc.nextInt();
            int priority = sc.nextInt();
            pq.add(new int[]{id,priority});  
            char ch = sc.next().charAt(0); 
            if(ch=='n'||ch=='N')
            break;

        }
        while(!pq.isEmpty()){
            System.out.println(pq.poll()[0]);
        }
    }
}