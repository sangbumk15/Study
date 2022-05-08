package aiden.study.problem;

/**
 * Leetcode 41
 * Given an unsorted integer array nums, return the smallest missing positive integer.
 */
public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        int len = nums.length, i = 0, temp = 0;
        while (i < len) {
            if (nums[i] > 0 && nums[i] < len && nums[nums[i] - 1] != nums[i]) {
                temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            } else {
                i ++;
            }
        }

        for (i = 0; i < len; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return len + 1;
    }

    public static void main(String[] args) {
        FirstMissingPositive fmp = new FirstMissingPositive();
        System.out.println(fmp.firstMissingPositive(new int[]{1,2,0}));
        System.out.println(fmp.firstMissingPositive(new int[]{3,4,-1,1}));
        System.out.println(fmp.firstMissingPositive(new int[]{7,8,9,11,12}));
    }
}
