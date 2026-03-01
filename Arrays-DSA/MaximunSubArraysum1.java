//Brute force approach
//Time complexity:O(n2),space complexity:O(1)

public class MaximunSubArraysum1{
    static int maxsubarray(int arr[]){
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                maxsum=Math.max(sum,maxsum);
            }
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4};
        System.out.print("Maximum sub array sum:"+maxsubarray(arr));
    }
}
