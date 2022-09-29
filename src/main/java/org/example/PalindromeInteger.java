package org.example;

/**
 * Given an integer x, return true if x is palindrome integer.
 * <p>
 * An integer is a palindrome when it reads the same backward as forward.
 * <p>
 * For example, 121 is a palindrome while 123 is not.
 */
public class PalindromeInteger {
    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));
        System.out.println(isPalindrome(12345));
        System.out.println(isPalindrome(1221));
    }
/*

    public static boolean isPalindrome(Integer number) {
        int halfNumber = number / 2;
        for (int i = 0; i < halfNumber; i++) {
            String a = String.valueOf(number.toString().charAt(i));
            String b = String.valueOf(number.toString().charAt(number - i - 1));
            if (!a.equals(b)) {
                return false;
            }
        }
        return true;
    }
*/

    public static boolean isPalindrome(int x) {
        String string = Integer.toString(x);
        for (int i = 0; i < (string.length() / 2); ++i) {
            String string1 = String.valueOf(string.charAt(i));
            String string2 = String.valueOf(string.charAt(string.length() - i - 1));
            if (!string1.equalsIgnoreCase(string2)) {
                return false;
            }
        }
        return true;
    }
}
