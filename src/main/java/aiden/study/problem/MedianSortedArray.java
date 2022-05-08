package aiden.study.problem;

/**
 * Leetcode 4
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 */
public class MedianSortedArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length, len2 = nums2.length, ind1 = 0, ind2 = 0;
        boolean isEven = (len1 + len2) % 2 == 0;
        int midInd = (len1 + len2) / 2;
        int[] sorted = new int[midInd + 1];

        for (int i = 0; i <= midInd; i++) {
            if (ind1 < len1 && ind2 < len2) {
                if (nums1[ind1] > nums2[ind2]) {
                    sorted[i] = nums2[ind2];
                    ind2++;
                } else if (nums1[ind1] <= nums2[ind2]) {
                    sorted[i] = nums1[ind1];
                    ind1++;
                }
            } else if (ind1 < len1) {
                sorted[i] = nums1[ind1];
                ind1++;
            } else {
                sorted[i] = nums2[ind2];
                ind2++;
            }
        }
        return isEven ? (double) (sorted[midInd - 1] + sorted[midInd]) / 2 : sorted[midInd];
    }

    public static void main(String[] args) {
        MedianSortedArray msa = new MedianSortedArray();
        int[] nums1 = {1,2};
        int[] nums2 = {3};
        System.out.println(msa.findMedianSortedArrays(nums1, nums2));

        int[] nums3 = {1,2};
        int[] nums4 = {3,4};
        System.out.println(msa.findMedianSortedArrays(nums3, nums4));
    }
}
