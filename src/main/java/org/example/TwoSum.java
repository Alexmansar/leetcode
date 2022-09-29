package org.example;

import java.util.Arrays;

public class TwoSum {

    /**
     * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     * You can return the answer in any order.
     * <p>
     * Example 1:
     * Input: nums = [2,7,11,15], target = 9
     * Output: [0,1]
     * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
     * <p>
     * Example 2:
     * Input: nums = [3,2,4], target = 6
     * Output: [1,2]
     * <p>
     * Example 3:
     * Input: nums = [3,3], target = 6
     * Output: [0,1]
     **/

    public static void main(String[] args) {
        System.out.println("Example 1: " + Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println("Example 2: " + Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println("Example 3: " + Arrays.toString(twoSum(new int[]{3, 3}, 6)));
        System.out.println("Example 4: " + Arrays.toString(twoSum(new int[]{3, 4, 2, 4}, 8)));
        System.out.println("Example 5: " + Arrays.toString(twoSum(new int[]{4, 2, 3, 1}, 5)));
        System.out.println("Example 6: " + Arrays.toString(twoSum(new int[]{3, 3}, 4)));
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int number = target - nums[i];
                if (nums[j] == number) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException();
    }
}