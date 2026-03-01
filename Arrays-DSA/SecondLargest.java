public class SecondLargest {
    public static void main(String[] args) {
        int arr[]={1,2,4,7,7,5};
        int large=Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>large){
                secondlargest=large;
                large=arr[i];
            }
            else if(arr[i]>secondlargest && arr[i]!=large){
                secondlargest=arr[i];
            }
        }
        System.out.print(secondlargest);
    }
}
