//Optimal approach 
//Time complexity:O(n),space complexity:O(1)

public class MoveAllZeorsToEnd {
     static void MoveZeros(int arr[]){
        int index=0;
        //move all non-zero elemnts to front
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[index]=arr[i];
                index++;
                
            }
        }
        //fill remaining positions with zeroes
        while(index<arr.length){
            arr[index]=0;
            index++;
        }
                  
     }
    public static void main(String[] args) {
        int arr[]={1,0,2,3,2,0,0,4,5,1};
        MoveZeros(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

