public class ImplementstrStr {
    static int strStr(String haystack,String needle){
        if(needle.length()==0)
            return 0;
        int n=haystack.length();
        int m=needle.length();
        for(int i=0;i<=n-m;i++){
            int j;
            for( j=0;j<m;j++){
                if(haystack.charAt(i+j)!=needle.charAt(j)){
                    break;
                }
            }
            if(j==m)
                return i;
            
          
        }
          return -1;

    }
    public static void main(String[] args) {
        System.out.println(strStr("hello","ll"));
    }
}
