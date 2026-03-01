//Two sum using optimal appraoch
//Time complexity:O(n),space complexity:O(1)

public class TwoSum2 {
    static void twosum(int arr[],int target){
        int left=0;
        int right=arr.length-1;
         while(left<right){
            int sum=arr[left]+arr[right];
         
         if(sum==target){
             System.out.println(arr[left]+","+arr[right]);
             return;
         }
         else if(sum<target){
            left++;
         }
         else{
            right--;
         }
    }
    System.out.println("No pair found");
}
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int target=11;
        twosum(arr,target);
    }
}
