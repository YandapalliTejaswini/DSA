public class FrequencyCount {
     public static void main(String[] args) {
        String s="Tejaswini";
        int freq[]=new int[256];
        for(char c:s.toCharArray()){
            freq[c]++;
        }
        System.out.println("Character frequency count:");
        for(int i=0;i<256;i++){
            if(freq[i]>0){
                System.out.println((char)i+"->"+freq[i]);
            }
        }
    }
}
