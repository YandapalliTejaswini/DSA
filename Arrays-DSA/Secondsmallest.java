public class Secondsmallest {
    public static void main(String[] args) {
        int arr[]={1,2,4,7,7,5};
        int small=Integer.MAX_VALUE;
        int secondsmall=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<small){
                secondsmall=small;
                small=arr[i];

            }
            else if(arr[i]<secondsmall&&arr[i]!=small){
                secondsmall=arr[i];
            }
        }
        System.out.print(secondsmall);
    }
}
