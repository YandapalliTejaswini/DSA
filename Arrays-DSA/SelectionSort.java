//time complexity:O(n2),space complexity:O(1)

public class SelectionSort {
    static void Selectionsort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minindex=i;
            //find smallest element
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minindex]){
                      minindex=j;
                }
            }
            //swap
            int temp=arr[minindex];
           arr[minindex]=arr[i];
           arr[i]=temp;
        }
        
    }
    public static void main(String[] args) {
        int arr[]={13,46,24,52,20,9};
        Selectionsort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
