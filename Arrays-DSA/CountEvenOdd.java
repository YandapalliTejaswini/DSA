package Arrays;
public class CountEvenOdd {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int evencount=0;
        int oddcount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0)
                evencount++;
            else
                oddcount++;
        }
        System.out.print("Even="+evencount);
        System.out.print("Odd="+oddcount);
    }
}
