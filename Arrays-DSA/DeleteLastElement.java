package Arrays;
public class DeleteLastElement {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70};
        int newArr[]=new int[arr.length-1];
        for(int i=0;i<newArr.length;i++){
            newArr[i]=arr[i];
        }
        for(int i=0;i<newArr.length;i++){
            int x=newArr[i];
            System.out.println(x+"");
        }
    }
}
