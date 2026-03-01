//Brute force approach
//Time complexity:O(n2),space complexity:O(1)

public class MajorityElement1 {
    static int majorityelement(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>n/2){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,2,2,4,2,1,1,1,1,1,1};
        System.out.println("Majority element is:"+majorityelement(arr));
    }
}
