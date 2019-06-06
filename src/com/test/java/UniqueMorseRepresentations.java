package com.test.java;

import java.util.*;

/**
 * 804. 唯一摩尔斯密码词
 * https://leetcode-cn.com/problems/unique-morse-code-words/
 */
public class UniqueMorseRepresentations {

    final static String[] MORSE = {
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."
    };

    final static String[] LETTER = {
            "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z",
    };

    public static void main(String[] args) {
        int i = uniqueMorseRepresentations(new String[]{"rwjje", "aittjje", "auyyn", "lqtktn", "lmjwn"});
        System.out.println(i);
    }


    public static int uniqueMorseRepresentations(String[] words) {

        if (words == null || words.length == 0) return 0;

        Map<String, String> map = new HashMap<>(26);
        for (int i = 0; i < LETTER.length; i++) {
            map.put(LETTER[i], MORSE[i]);
        }

        String[] change = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            StringBuffer M = new StringBuffer();
            for (int j = 0; j < words[i].length(); j++) {
                String morse = map.get(String.valueOf(words[i].charAt(j)));
                M.append(morse);
                System.out.println(words[i].charAt(j) + " --> " + morse);

            }
            change[i] = M.toString();
            System.out.println(words[i] + " ------> " + change[i]);
        }
        Set<String> set = new HashSet<>(Arrays.asList(change));
        return set.size();
    }
}
