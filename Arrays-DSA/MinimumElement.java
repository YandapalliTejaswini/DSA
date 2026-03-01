public class MinimumElement {
    public static void main(String[] args) {
        int arr[]={3,7,1,9,4};
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
