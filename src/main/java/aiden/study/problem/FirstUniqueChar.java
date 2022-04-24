package aiden.study.problem;

import java.util.*;

/**
 * Leetcode 387
 * Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1
 */
public class FirstUniqueChar {

    public int firstUniqChar(String s) {
        Map<Character, Integer> charMap = new LinkedHashMap<>();
        Set<Character> repCharSet = new HashSet<>();

        for (int i = 0; i < s.length(); i ++) {
            char c = s.charAt(i);
            if (!charMap.containsKey(c)) {
                charMap.put(c, i);
            } else {
                repCharSet.add(c);
            }
        }

        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            if (!repCharSet.contains(entry.getKey())) {
                return entry.getValue();
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        FirstUniqueChar uc = new FirstUniqueChar();
        System.out.println(uc.firstUniqChar("dbddaadbb"));
    }
}
