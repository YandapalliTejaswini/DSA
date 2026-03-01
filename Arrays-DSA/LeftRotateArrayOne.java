//Time complexity:O(n),space complexity:O(1)

public class LeftRotateArrayOne {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int temp=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
        System.out.println("after left rotate by one:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}

