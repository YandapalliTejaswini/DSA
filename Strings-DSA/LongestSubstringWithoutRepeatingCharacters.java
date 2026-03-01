import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        HashSet<Character>set = new HashSet<>();
        String s="abcabcbb";
        int left=0,maxlen=0;
        for(int right=0;right<s.length()-1;right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxlen=Math.max(maxlen,right-left+1);
        }
        System.out.println(maxlen);
    }
}
