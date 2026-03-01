//Optimal approach
//Time complexity:O(n),space complexity:O(n)

public class LongestSubArrayWithSumk2 {
        static int longestsubarray(int arr[],int k){
            int left=0,right=0,maxlength=0,sum=0;
            while(right<arr.length){
                sum+=arr[right];
                while(sum>k){
                    sum-=arr[left];
                    left++;
                }
                if(sum==k){
                    maxlength=Math.max(maxlength,right-left+1);
                }
                right++;
            }
            return maxlength;
        }
    public static void main(String[] args) {
        int arr[]={1,2,3,1,1,1,1};
        System.out.println("Longest sub array:"+longestsubarray(arr,5));
    }
}
