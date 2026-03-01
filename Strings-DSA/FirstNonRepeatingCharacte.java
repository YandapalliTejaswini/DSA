public class FirstNonRepeatingCharacte {
    public static void main(String[] args) {
        String s="tejaswini";
        int freq[]=new int[256];
        for(char c:s.toCharArray()){
            freq[c]++;
        }
        for(char c:s.toCharArray()){
            if(freq[c]==1){
                System.out.println("First non repeating character:"+c);
                return;
            }
        }
    
       System.out.println("No non repeating character found");
}
}

