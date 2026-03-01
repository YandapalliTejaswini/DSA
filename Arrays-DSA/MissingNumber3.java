//Optimal approach using sum

public class MissingNumber3 {
    static int findmissing(int arr[],int n){
        int expectedsum=n*(n+1)/2;
        int actualsum=0;
        for(int num:arr){
            actualsum+=num;
        }
        return expectedsum-actualsum;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int n=10;
        System.out.println("Missing number is:"+findmissing(arr,n));
    }
}
   