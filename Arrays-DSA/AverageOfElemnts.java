
public class AverageOfElemnts {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,3,5};
        int sum=0;
        for(int i=0;i<arr.length;i++)
            sum=sum+arr[i];
            double average=sum/(double)arr.length;
        
        System.out.println("Average="+average);
    }
}


