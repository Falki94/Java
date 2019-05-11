/*
 *The Longest palindrome of string
 */
package AdditionalExercise;

import java.util.Scanner;

/**
 *
 * @author Falki
 */
public class TheBiggestPalindrom {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        System.out.println(theLongestPalindrome(word));
    }

    public static String theLongestPalindrome(String s) {

        String result = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length() - 1; j >= 0 && j != i; j--) {
                if (isPalindromowo(s.substring(i, j + 1))) {
                    if (s.substring(i, j + 1).length() > result.length()) {
                        result = s.substring(i, j + 1);
                    }
                }
            }
        }
        return result;
    }

    public static boolean isPalindromowo(String x) {
        x = x.toLowerCase();
        for (int i = 0, j = x.length() - 1; i <= x.length() / 2; i++, j--) {
            if (x.charAt(i) != x.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
