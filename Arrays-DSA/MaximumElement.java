public class MaximumElement {
    public static void main(String[] args) {
        int arr[]={10, 3, 45, 7, 2};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);

    }
}
