//Brute force appraoch
//Time complexity:O(n2),space complexity:O(1)

public class LongestSubArrayWithSumK {
    static int longestsubarray(int arr[],int k){
        int maxlength=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum==k){
                    maxlength=Math.max(maxlength,j-i+1);
                }
            }
        }
        return maxlength;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,1,1,1,1};
        System.out.println("Longest sub array:"+longestsubarray(arr,5));

    }
}

