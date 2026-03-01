 //Time complexity:O(n logn),space complexity:O(n)

public class MergeSort {
    static void mergesort(int arr[],int lb,int ub){
        if(lb<ub){
            int mid=(lb+ub)/2;
            mergesort(arr,lb,mid);
            mergesort(arr,mid+1,ub);
            merge(arr,lb,mid,ub);
        }
    }
    static void merge(int arr[],int lb,int mid,int ub){
        int i=lb;
        int j=mid+1;
        int k=lb;
        int b[]=new int[arr.length];
        while(i<=mid && j<=ub){
            if(arr[i]<=arr[j]){
               b[k]=arr[i];
                i++;
            }
            else{
                b[k]=arr[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            b[k] = arr[i];
            i++;
            k++;
        }
         while (j <= ub) {
            b[k] = arr[j];
            j++;
            k++;
        }
        for (k = lb; k <= ub; k++) {
            arr[k] = b[k];
        }
    }
    public static void main(String[] args) {
        int arr[]={15,5,24,8,1,3,16,10,20};
        mergesort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
 
