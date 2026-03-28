import java.util.Scanner;

public class SortCharactersByFrequency{
    public static String frequencysort(String s){
       int freq[]=new int[126];
       for(char c:s.toCharArray()){
            freq[c]++;
        }
       StringBuilder result=new StringBuilder();
       int max=0;
       char maxChar=0;
       for(int i=0;i<s.length();i++){
           for(int j=0;j<126;j++){
            if(freq[j]>max){
                max=freq[j];
                maxChar=(char)j;
            }
           }
           while(max>0){
            result.append(maxChar);
            max--;
           }
           freq[maxChar]=0;
       }
       return result.toString();
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        String result = frequencysort(s);

        System.out.println("Sorted by frequency: " + result);

        sc.close();
    }
}

