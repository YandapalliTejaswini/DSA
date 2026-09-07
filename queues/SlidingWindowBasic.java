import java.util.LinkedList;
import java.util.Queue;

public class SlidingWindowBasic {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int k=3;
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<k;i++){
            q.offer(arr[i]);
           
        }
         System.out.println(q);
        for(int i=k;i<arr.length;i++){
            q.poll();
            q.offer(arr[i]);
            System.out.println(q);
        }

    }
}
