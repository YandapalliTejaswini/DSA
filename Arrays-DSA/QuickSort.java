public class QuickSort {
    static void quicksort(int arr[],int low,int high){
        if(low<high){
            int pivotIndex=partition(arr,low,high);
            quicksort(arr,low,pivotIndex-1);
            quicksort(arr,pivotIndex+1,high);
        }
    }
    static int partition(int arr[],int low ,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<=pivot){
                i++;
                //Swap arr[i],arr[j]
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        quicksort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

