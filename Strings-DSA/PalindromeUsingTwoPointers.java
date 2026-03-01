public class PalindromeUsingTwoPointers {
    public static void main(String[] args) {
        String s="tejaswini";
        int left=0;
        int right=s.length()-1;
        boolean isPalindrome=true;
        while(left<right){
             if(s.charAt(left)!=s.charAt(right)){
                isPalindrome=false;
                break;
             }
             left++;
             right--;
        }
        System.out.println(isPalindrome?"Palindrome":"Not Palindrome");
    }
    
}
