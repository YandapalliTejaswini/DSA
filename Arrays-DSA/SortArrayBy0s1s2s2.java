//Dutch national flag algorithm-Brute force approach
//time complexity:O(n),space complexity:O(1)

public class SortArrayBy0s1s2s2 {
    static void sortarray(int arr[]){
        int low=0,mid=0,high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                   mid++;

            }
            else{
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }

        }
    }

    public static void main(String[] args) {
        int arr[]={0,1,2,0,1,2,1,0};
        sortarray(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
