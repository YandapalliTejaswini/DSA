//Brute force approach
//Time complexity:O(n),space complexity:O(1)

public class SortArrayBy0s1s2s1 {
    static void sortArray(int arr[]){
        int count0=0,count1=0,count2=0;
        for(int num:arr){
            if(num==0)
                count0++;
            
            else if(num==1)
                count1++;
            
            else count2++;
            }
            int index=0;
            for(int i=0;i<count0;i++)
                arr[index++]=0;
            for(int i=0;i<count1;i++)
                arr[index++]=1;
            for(int i=0;i<count2;i++)
                arr[index++]=2;
            }

        
    

    public static void main(String[] args) {
        int arr[]={0,1,2,0,1,2,1,0};
        sortArray(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

