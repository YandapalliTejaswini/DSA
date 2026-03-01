//Time complexity:O(n),space complexity:O(1)
//Anagram--two strings are angram if they have same length,same characters,same frequency,order does not matter


public class AnagramCheck{
    public static void main(String[] args) {
        String s1="teju";
        String s2="juet";
        if(s1.length()!=s2.length()){
            System.out.println("Not Anagram");
            return;
        }
        int freq[]=new int[256];
        for(char c:s1.toCharArray()){
            freq[c]++;
        }
        for(char c:s2.toCharArray()){
            freq[c]--;
        }
         for(int i=0;i<256;i++){
            if(freq[i]!=0){
                System.out.println("NOt anagram");
            }
         }
         System.out.println("Anagram");
    }
}