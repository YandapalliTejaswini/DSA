//Brute force approach
//Time complexity:O(n2),space complexity:O(1)

public class TwoSum1 {
    static void twosum(int arr[],int k){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
               if(arr[i]+arr[j]==k){
                      System.out.print(arr[i]+","+arr[j]);
                      return;
               }
    }
    
    }
    System.out.println("No pair found");
}
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int k=8;
        twosum(arr,k);
    }
}

