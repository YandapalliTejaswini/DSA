public class LongestPalindrome {
    public static int longestpalindrome(String s){
        int freq[]=new int[256];

        for(char c:s.toCharArray()){
            freq[c]++;
        }
        int length=0;
        boolean oddfound=false;
        for(int count:freq){
            if(count%2==0){
                length+=count;
            }
            else{
                length+=count-1;
                oddfound=true;
            }
        }
        if(oddfound){
            length+=1;
        }
        return length;

    }
    public static void main(String[] args) {
        String s="abccccdd";
        System.out.println(longestpalindrome(s));
    }
}