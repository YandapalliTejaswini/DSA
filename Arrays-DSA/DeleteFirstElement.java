package Arrays;
public class DeleteFirstElement {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int newArr[]=new int[arr.length-1];
        for(int i=1;i<arr.length;i++){
             newArr[i-1]=arr[i];
        }
        for(int i=0;i<newArr.length;i++){
            int x=newArr[i];
            System.out.println(x+"");
        }
    }
}
