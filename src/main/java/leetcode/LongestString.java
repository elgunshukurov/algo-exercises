package leetcode;

import java.util.Objects;

public class LongestString {
    public static void main(String[] args) {
        LongestString longestString = new LongestString();
        String[] strs ={"flower","flow","flight", ""};
        System.out.println(longestString.longestCommonPrefix(strs));
    }
    public String longestCommonPrefix(String[] strs) {
        String temp = strs[0];
        for (int i = 1; i < strs.length; i++) {
            temp = parseString(temp, strs[i]);
            if (Objects.equals(temp, "")) {
                return  temp;
            }
        }
        return temp;
    }

    public String parseString(String str1, String str2) {
        int len = str1.length()>str2.length()?str2.length():str1.length();
        String temp = "";
        for (int i = 0; i < len; i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                temp = str1.substring(0, i+1);
            } else {
                return temp;
            }
        }
        return  temp;
    }
}
