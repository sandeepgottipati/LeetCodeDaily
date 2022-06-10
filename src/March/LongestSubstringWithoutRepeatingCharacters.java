package March;
//T.C : O(N)
//S.C :O(N)
import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {
    public int longestSubstring(String s){
        if(s.length()==0 || s==null) return 0;
        HashMap<Character,Integer> hm=new HashMap<>();
        int slow=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i))){
                slow=Math.max(slow,hm.get(s.charAt(i))+1);

            }
            count=Math.max(count,i-slow+1);
            hm.put(s.charAt(i),i);
        }
        return count;
    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters obj=new LongestSubstringWithoutRepeatingCharacters();
        System.out.println(obj.longestSubstring("abcabcbb"));
    }
}
