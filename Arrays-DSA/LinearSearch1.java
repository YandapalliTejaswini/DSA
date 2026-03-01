public class LinearSearch1 {
    public static void main(String[] args) {
        int a[]={1,2,4,6,10,12,14};
          int target=10;
          for(int i=0;i<a.length;i++){
            if(a[i]==target){
                System.out.print(i);
            }
          }
    }
}
