import java.util.HashSet;

public class Union {
    public static int main(String[] args) {
         HashSet<Integer> set=new HashSet<>();


        int arr1[]={1,2,3,4};
        int arr2[]={2,4,5,6};

        for(int num:arr1){
            set.add(num);
        }
          
        for(int num:arr2){
            set.add(num);
        }

        return set.size();
       


        
    }
}
