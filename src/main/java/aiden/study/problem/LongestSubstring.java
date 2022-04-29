package aiden.study.problem;

import java.util.HashMap;

/**
 * Leetcode 3
 * Given a string s, find the length of the longest substring without repeating characters.
 */
public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> mem = new HashMap<>();
        int lastRepInd = 0, maxLen = 0;
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (mem.containsKey(c)){
                lastRepInd = Math.max(lastRepInd, mem.get(c) + 1);
            }
            mem.put(c, i);
            maxLen = Math.max(maxLen, (i - lastRepInd + 1));
        }
        return maxLen;
    }

    public static void main(String[] args) {
        LongestSubstring ls = new LongestSubstring();
        System.out.println(ls.lengthOfLongestSubstring("abcabcbb")); // 3
        System.out.println(ls.lengthOfLongestSubstring("bbbbb")); // 1
        System.out.println(ls.lengthOfLongestSubstring("pwwkew")); // 3
    }
}
