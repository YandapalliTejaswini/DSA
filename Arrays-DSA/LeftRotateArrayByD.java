//Time complexity:O(n),space complexity:O(d)

//Brute force approach
public class LeftRotateArrayByD {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int d=4;
        int n=arr.length;
        if(d==0||n==0) return; //edge case
        d=d%n;  //if d>n;
        if(d==0) return;
        //store the d elemnts
        int temp[]=new int[d];
        for(int i=0;i<d;i++){
            temp[i]=arr[i];
        }

        //shift remaining elements to the left
        for(int i=d;i<n;i++){
            arr[i-d]=arr[i];
        }

        //copy stored elements to the end
        for(int i=0;i<d;i++){
            arr[n-d+i]=temp[i];
        }

        //print rotated array
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
