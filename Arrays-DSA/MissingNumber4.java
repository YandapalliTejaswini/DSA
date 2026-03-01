 //Optimal approach using xor

public class MissingNumber4 {
    static int findmissing(int arr[],int n){
        int xor=0;
        for(int i=0;i<=n;i++){
            xor^=i;
        }
        for(int num:arr){
            xor^=num;
        }
        return xor;

    }
    public static void main(String[] args) {
        int arr[]={1,2,4,5};
        int n=5;
        System.out.println("Missing number:"+findmissing(arr,n));
    }
}
 
