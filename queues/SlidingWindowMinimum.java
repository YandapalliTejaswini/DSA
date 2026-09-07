import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMinimum {
    static int[] minslidingwindow(int arr[],int k){
        Deque<Integer> dq=new LinkedList<>();
        int ans[]=new int[arr.length-k+1];
        int result=0;
        for(int i=0;i<arr.length;i++){
            while(!dq.isEmpty()&&dq.peekFirst()<=i-k){
                dq.pollFirst();
            }
            while(!dq.isEmpty()&&arr[dq.peekLast()]>=arr[i]){
                dq.pollLast();
            }
            dq.offer(i);
            if(i>=k-1){
                ans[result++]=arr[dq.peekFirst()];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
         int arr[]={1,3,-1,-3,5,3,6,7};
         int result[]=minslidingwindow(arr, 3);
         for(int val:result){
            System.out.print(val+" ");
         }

    }
}
