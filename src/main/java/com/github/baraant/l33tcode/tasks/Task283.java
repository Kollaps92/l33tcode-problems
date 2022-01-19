package com.github.baraant.l33tcode.tasks;

/*
283. Move Zeroes
Easy

Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]


Constraints:

1 <= nums.length <= 104
-2^31 <= nums[i] <= 2^31 - 1
*/
public class Task283 {
    public void moveZeroes(int[] nums) {

        int curFirstZeroIndex = -1;
        int shift = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                shift++;

                if (curFirstZeroIndex == -1) {
                    curFirstZeroIndex = i;
                }
            } else if (nums[i] != 0 && curFirstZeroIndex != -1) {
                shiftNonZerosToTheLeft(nums, curFirstZeroIndex, i, shift);
                curFirstZeroIndex = i - shift + 1;
            }
        }

    }

    private void shiftNonZerosToTheLeft(int[] nums, int startIndex, int endIndex, int shift) {
        for (int i = startIndex; i <= endIndex - shift; i++) {
            nums[i] = nums[i + shift];
        }

        for (int j = endIndex - shift + 1; j <= endIndex; j++) {
            nums[j] = 0;
        }
    }

}
