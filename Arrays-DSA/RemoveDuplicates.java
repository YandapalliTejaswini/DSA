public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,4};
        System.out.println(arr[0]+"");
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                System.out.println(arr[i]+" ");
            }
        }
    }
}
