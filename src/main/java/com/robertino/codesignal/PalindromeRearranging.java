package com.robertino.codesignal;

import java.util.HashSet;
import java.util.Set;

/*
https://app.codesignal.com/arcade/intro/level-4/Xfeo7r9SBSpo3Wico

Given a string, find out if its characters can be rearranged to form a palindrome.

Example

For inputString = "aabb", the output should be
palindromeRearranging(inputString) = true.

We can rearrange "aabb" to make "abba", which is a palindrome.

Input/Output

[execution time limit] 3 seconds (java)

[input] string inputString

A string consisting of lowercase English letters.

Guaranteed constraints:
1 ≤ inputString.length ≤ 50.

[output] boolean

true if the characters of the inputString can be rearranged to form a palindrome, false otherwise.
 */


public class PalindromeRearranging {

    boolean palindromeRearranging(String inputString) {
        Set<Character> letters = new HashSet<>();
        for (Character ch : inputString.toCharArray()) {
            if(!letters.remove(ch)) {
                letters.add(ch);
            }
        }
        return letters.size() > 1 ? false : true;
    }
}
