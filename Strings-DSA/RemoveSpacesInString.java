/*We use three ways to remove spaces in a string
1.USing replace()
ex:String s="Teja swini";
   s.replace(" ","");
2.Using replaceAll()
ex:String s="Tej swini Red dy";
s.replaceAll("\\s","");
3.using stringBulider;   
*/

//Time complexity:O(n),space complexity:O(n)


public class RemoveSpacesInString {
    public static void main(String[] args) {
        String s="Teja swini Red dy";
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c!=' '){
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }
}

