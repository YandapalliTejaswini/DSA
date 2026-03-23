public class SubstringInAString {
    static int substring(String text,String pattern){
        int n=text.length();
        int m=pattern.length();
        for(int i=0;i<n-m;i++){
            int j=0;
            for(j=0;j<m;j++){
                if(text.charAt(i+j)!=pattern.charAt(j)){
                    break;
                }
            }
            if(j==m){
                System.out.println(i);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String text="abacbdae";
        String pattern="bda";
        substring(text,pattern);


    }
}
