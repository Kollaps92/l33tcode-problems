package com.github.baraant.l33tcode.tasks;

/*
344. Reverse String
Easy

Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.



Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]


Constraints:

1 <= s.length <= 10^5
s[i] is a printable ascii character.
*/

public class Task344 {
    public void reverseString(char[] s) {
        char buffer;
        int length = s.length;

        for (int i = 0; i < length / 2; i++) {
            buffer = s[i];
            s[i] = s[length - i - 1];
            s[length - i - 1] = buffer;
        }
    }
}
