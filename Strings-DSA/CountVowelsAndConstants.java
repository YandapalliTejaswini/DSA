
//Time complexity:O(n),space complexity:O(1)

public class CountVowelsAndConstants {
    public static void main(String[] args) {
        String s="tejaswini";
        int vowels=0;
        int constants=0;
        s.toLowerCase();
        for(char c:s.toCharArray()){
             if(c>='a'&& c<='z'){
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                    vowels++;
                }
                else{
                    constants++;
                }
                }
             }
             System.out.println("Vowels count:"+vowels);
               System.out.println("Constants count:"+constants);
        }
    }


