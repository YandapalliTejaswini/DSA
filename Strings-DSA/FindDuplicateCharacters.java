public class FindDuplicateCharacters {
    public static void main(String[] args) {
        String s="Tejaswini";
        int freq[]=new int[256];
        for(char c:s.toCharArray()){
            freq[c]++;
        }
        System.out.println("Duplicate characters count:");
        for(int i=0;i<256;i++){
            if(freq[i]>1){
                System.out.println((char)i+"->"+freq[i]);
            }
        }
    }
}
