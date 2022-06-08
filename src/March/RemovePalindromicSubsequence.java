package March;

/*problem description:
link: https://leetcode.com/problems/remove-palindromic-subsequences/
Date: 06-08-2022
 */
//Time complexity:O(n)
//space complexity:O(1)
public class RemovePalindromicSubsequence {
    public int removePalindromicSubsequence(String s){
        if(s.length()==0 || s=="") return 0;
        if(isPalindrome(s)){
            return 1;
        }
        else{
            return 2;
        }
    }
    private boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        RemovePalindromicSubsequence obj=new RemovePalindromicSubsequence();
        System.out.println(obj.removePalindromicSubsequence("abbbab"));
    }
}
