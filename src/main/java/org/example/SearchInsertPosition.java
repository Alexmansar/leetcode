package org.example;

/**
 * Given a sorted array of distinct integers and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 */
public class SearchInsertPosition {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 2));
        System.out.println(searchInsert(new int[]{1, 3, 5, 7}, 0));
        System.out.println(searchInsert(new int[]{1}, 1));
        System.out.println(searchInsert(new int[]{1, 3}, 3));
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 5));
        System.out.println(searchInsert(new int[]{2, 5}, 1));
        System.out.println(searchInsert(new int[]{-1, 3, 5, 6}, 1));
    }

    public static int searchInsert(int[] nums, int target) {
        if ((   /*target == 0 ||*/ nums[0] == target || nums[0] > target) && nums.length >= 1) return 0;
        if (nums.length == 1 && nums[0] != 0 && nums[0] < target) return 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            } else if (nums[i - 1] < target && nums[i] > target) {
                return i;
            }
        }
        return nums.length;
    }


}
