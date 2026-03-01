//Optimal approach(Moores voting algorithm)

public class MajorityElement2 {
    static int majority(int arr[]){
        int count=0,candidate=-1;
        for(int num:arr){
            if(count==0){
                candidate=num;
            }
            if(num==candidate){
                count++;
            }
            else{
                count--;
            }
        }
            
            count=0;
            for(int num:arr){
                if(num==candidate)
                count++;
            }
            if(count>arr.length/2){
                return candidate;
            }
             return -1;
        }
       
    

    public static void main(String[] args) {
        int arr[]={1,2,3,2,2,4,2,1,2};
        System.out.println("Majority element is:"+majority(arr));
    }
    
}

