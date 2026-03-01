//Time complexity:O(n2),space complexity:O(1)

public class BubbleSort {
    static void bubblesort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                 if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                 }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={5,1,4,2,8};
        bubblesort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}