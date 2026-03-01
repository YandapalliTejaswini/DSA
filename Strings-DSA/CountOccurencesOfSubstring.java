public class CountOccurencesOfSubstring {
    static int countsubstring(String text,String pattern){
        int n=text.length();
        int m=pattern.length();
        int count=0;
        for(int i=0;i<=n-m;i++){
            int j=0;
            for(j=0;j<m;j++){
                if(text.charAt(i+j)!=pattern.charAt(j)){
                    break;
                }
            }
            if(j==m){
                count++;
        }
    }
        return count;
    }
    public static void main(String[] args) {
        String text="tejuteju";
        String pattern="teju";
       System.out.println("Ocuurences of substring:"+ countsubstring(text,pattern));
    }
}
