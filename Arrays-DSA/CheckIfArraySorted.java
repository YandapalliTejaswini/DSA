public class CheckIfArraySorted {
    public static void main(String[] args) {
        int arr[]={1,2,5,3,4};
        boolean isSorted=true;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                isSorted=false;
                break;
            }
        }
        if(isSorted){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
          
    }
}
