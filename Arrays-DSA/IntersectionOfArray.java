
import java.util.ArrayList;
public class IntersectionOfArray {
    static ArrayList<Integer> intersection(int a[],int b[]){
        int i=0,j=0;
        ArrayList<Integer> result=new ArrayList<>();
        while(i<a.length&&j<b.length){
            if(i>0&&a[i]==a[i-1]){
                i++;
                continue;
            }
            if(j>0&&b[j]==b[j-1]){
                j++;
                continue;
            }
        if(a[i]<b[j]){
            i++;

        }else if(a[i]>b[j]){
            j++;
        }
        else{
            result.add(a[i]);
            i++;
            j++;
        }

        }
        return result;
        }
    
    public static void main(String[] args) {
        int a[]={1,2,1,3,4};
        int b[]={2,3,4,5};
        ArrayList<Integer> result= intersection(a,b);
        for(int x:result){
            System.out.print(x+" ");
        }

    }
}


