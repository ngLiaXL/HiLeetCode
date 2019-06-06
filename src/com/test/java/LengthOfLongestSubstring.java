package com.test.java;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {


    /**
     * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
     * abcabcbb
     *
     * @param s
     * @return
     */
    public static int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        Set<Character> set = new HashSet<>();
        for (int j = 0; j < s.length(); j++) {
            set.add(s.charAt(j));
            for (int i = j + 1; i < s.length(); i++) {
                if (!set.add(s.charAt(i))) {
                    break;
                }
            }
            if (maxLen < set.size()) {
                maxLen = set.size();
            }
            set.clear();
        }
        return maxLen;
    }
}
