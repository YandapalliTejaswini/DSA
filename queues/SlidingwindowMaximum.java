import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingwindowMaximum {
    static int[] maxslidingwindow(int arr[],int k){
        Deque<Integer> dq=new ArrayDeque<>();
        int ans[]=new int[arr.length - k + 1];
        int result=0;
        for(int i=0;i<arr.length;i++){
            //removes indices that are not in the window(k)
            while(!dq.isEmpty()&&dq.peekFirst()<=i-k){
                dq.pollFirst();
            }
            //remove smaller elemnts from back
            while(!dq.isEmpty()&&arr[dq.peekLast()]<=arr[i]){
                dq.pollLast();
            }
            //add current index
            dq.offerLast(i);
        
        if(i>=k-1){
           ans[result++]=arr[dq.peekFirst()];
        }
        
    }
    return ans;

    }
    public static void main(String[] args) {
        int arr[]={1,3,-1,-3,5,3,6,7};
        int result[]=maxslidingwindow(arr, 3);
      for(int val:result){
        System.out.print(val);
      }
    }
}
