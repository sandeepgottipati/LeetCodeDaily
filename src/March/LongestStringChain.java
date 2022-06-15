package March;

import java.util.*;

//Time Complexity: O(NlogN+N*L*L) where L is the length of the strings in the word array.
//Space Complexity:O(N*L)
//link:https://leetcode.com/problems/longest-string-chain/
public class LongestStringChain {
    public int longestStrChain(String[] words) {
        if (words.length == 0 || words == null) return 0;
        Arrays.sort(words, (a, b) -> a.length() - b.length());
        HashMap<String, Integer> hm = new HashMap<>();
        int res = 0;
        for (String word : words) {
            hm.put(word, 1);

            for (int i = 0; i < word.length(); i++) {
                StringBuilder current = new StringBuilder(word);
                String temp = current.deleteCharAt(i).toString();
                if (hm.containsKey(temp)) {
                    hm.put(word, Math.max(hm.get(word), hm.get(temp) + 1));
                }
            }
            res = Math.max(res, hm.get(word));
        }
        return res;
    }

    public static void main(String[] args) {
        LongestStringChain obj = new LongestStringChain();
        System.out.println(obj.longestStrChain(new String[]{"a", "b", "ba", "bca", "bda", "bdca"}));
    }
}
