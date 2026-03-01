//Time complexity:O(n),space Complexity:O(1)
//Optimal approach  
public class LeftRotateArrayByD1 {
   static void reverse(int arr[],int start,int end){
    while(start<end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;

    }
   }
     static void LeftRotate(int arr[],int d){
        int n=arr.length;
        d=d%n;
        //reverse of first d elemnts
        reverse(arr,0,d-1);
        //reverse the remaining elements
        reverse(arr,d,n-1);
        //reverse the whole array
        reverse(arr,0,n-1);
     }
public static void main(String[] args) {
    int arr[]={10,20,30,40,50};
    int d=6;
    LeftRotate(arr, d);
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]+" ");
    };
}
    
}
