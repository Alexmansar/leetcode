package org.example;

/**
 * Given a string s consisting of words and spaces, return the length of the last word in the string.
 * <p>
 * A word is a maximal substring consisting of non-space characters only.
 */

public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(lengthOfLastWord("Hello World"));
        System.out.println(lengthOfLastWord2("luffy is still joyboy"));
        System.out.println(lengthOfLastWord2("l22"));
    }

    public static int lengthOfLastWord(String s) {
        s = s.trim();
        char[] chars = s.toCharArray();
        int count = 1;
        for (int i = chars.length - 1; i > 0; i--) {
            if (chars[i] != ' ') {
                count++;
            } else {
                return count-1;
            }
        }
        return count;
    }

    public static int lengthOfLastWord2(String s) {
        return s.trim().length() - s.trim().lastIndexOf(" ") - 1;
    }

}