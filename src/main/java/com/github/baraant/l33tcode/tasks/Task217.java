package com.github.baraant.l33tcode.tasks;


import java.util.HashMap;
import java.util.Map;

/*
217. Contains Duplicate
Easy

Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true


Constraints:

1 <= nums.length <= 10^5
-10^9 <= nums[i] <= 10^9
*/
public class Task217 {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Boolean> idToPresentedFlag = new HashMap<>();

        for (int num : nums) {
            if (idToPresentedFlag.getOrDefault(num, false)) {
                return true;
            } else {
                idToPresentedFlag.put(num, true);
            }
        }

        return false;
    }
}
