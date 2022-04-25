package aiden.study.problem;

import java.util.HashMap;

/**
 * Leetcode 1
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 */
public class TwoSum {
    public int[] twoSumBrute(int[] nums, int target) {
        int[] out = new int[2];
        for (int i = 0; i < nums.length - 1; i ++) {
            for (int j = i + 1; j < nums.length; j ++) {
                if (nums[i] + nums[j] == target) {
                    out[0] = i;
                    out[1] = j;
                    return out;
                }

                if (nums[i] + nums[j] > target) {
                    break;
                }
            }
        }

        return out;
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target-nums[i]), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[]{0,0};
    }

    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int[] arr = {2,7,11,15};
        int[] out = ts.twoSumBrute(arr, 9);
        int[] out2 = ts.twoSum(arr, 9);
        System.out.println(out[0] + ", " + out[1]);
        System.out.println(out2[0] + ", " + out2[1]);
    }
}
