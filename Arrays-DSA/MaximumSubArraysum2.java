//Kaden's algorithm-optimal appraoch
//Time complexity:O(n),space complexity:O(1)

public class MaximumSubArraysum2 {
    static int maxsubarraysum(int arr[]){
        int currentsum=arr[0];
        int maxsum=arr[0];
        for(int i=0;i<arr.length;i++){
            currentsum=Math.max(arr[i],currentsum+arr[i]);
            maxsum=Math.max(currentsum,maxsum);
        }
        return maxsum;

    }
    public static void main(String[] args) {
        int arr[]={2,1,5,1,3};
        System.out.println("Maximun sub array with sum is:"+maxsubarraysum(arr));
    }
}

