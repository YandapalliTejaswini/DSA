//Better approach

public class MissingNumber2 {
    static int findmissing(int arr[],int n){
        boolean present[]=new boolean[n+1];
        for(int num:arr){
            present[num]=true;
        }
        for(int i=1;i<=n;i++){
            if(!present[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,3,4,5,6,7,8,9};
        int n=9;
        System.out.println("Missing number is:"+findmissing(arr,n));
    }
}
 
