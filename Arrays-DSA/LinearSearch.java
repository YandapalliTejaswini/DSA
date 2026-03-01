//Linear Search-Searching all the elements one by one until the target is found

public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int num=60;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
            System.out.println(i);
            }
            System.out.println("Not found");
        }
    }
}
 
