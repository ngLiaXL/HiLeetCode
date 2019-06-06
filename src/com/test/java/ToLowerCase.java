package com.test.java;

public class ToLowerCase {

    public static void main(String[] args) {
        System.out.println((int) 'A');
        System.out.println((int) 'Z');
        System.out.println((int) 'a');
        System.out.println((int) 'z');

        toLowerCase2("AABBCCDDEEFF");
    }

    public  static String toLowerCase2(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]<='Z' && chars[i]>='A'){
                chars[i] = (char) ((byte)chars[i] + 32);
            }
        }
        return String.valueOf(chars);
    }



    public static String toLowerCase(String str) {
        // A-Z 65-90
        // a-z 97-122
        if (str == null || str.length() == 0) return null;
        int d = 'a' - 'A';
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c <= 90 && c >= 65) {
                sbf.append((char) (c + d));
            } else {
                sbf.append(c);
            }
        }
        System.out.println(sbf.toString());
        return sbf.toString();
    }
}
