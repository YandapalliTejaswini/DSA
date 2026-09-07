import java.util.LinkedList;
import java.util.Queue;

public class FirstNegativeInSlidingWindow {
    static int[] firstnegative(int arr[],int k ){
        Queue<Integer> q=new LinkedList<>();
        int ans[]=new int[arr.length-k+1];
        int result=0;
        for(int i=0;i<arr.length;i++){
            //finding negative values in the array & adding their indices to the queue
            if(arr[i]<0){
                q.offer(i);
            }
            //check whether that indices are grater than the window
            if(i>=k-1){
                //checking if peek element is less or not
                while(!q.isEmpty()&&q.peek()<i-k+1){
                    q.poll();
                }
                
                if(q.isEmpty()){
                    ans[result]=0;
                }else{
                    ans[result]=arr[q.peek()];
                }
                result++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={ 12, -1, -7, 8,-15, 30, 16, 28};
        int result[]=firstnegative(arr, 3);
        for(int val:result){
            System.out.print(val+" ");
        }
    }
}
