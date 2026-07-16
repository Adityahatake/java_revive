public class FindDuplicateInArray {

    /*
     * Question:
     *
     * Given an integer array nums containing n + 1 integers where each integer
     * is in the range [1, n] inclusive, there is only one repeated number.
     * Find the duplicate number without modifying the array and using only
     * constant extra space.
     *
     * Example 1:
     * Input: nums = {1, 3, 4, 2, 2}
     * Output: 2
     *
     * Example 2:
     * Input: nums = {3, 1, 3, 4, 2}
     * Output: 3
     *
     * Constraints:
     * - 1 <= n <= 100000
     * - nums.length == n + 1
     * - Exactly one integer appears two or more times.
     *
     * TODO:
     * Implement the method below.
     */

    public static int findDuplicate(int[] nums) {
        // Write your solution here
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};

        int duplicate = findDuplicate(nums);

        System.out.println("Duplicate element: " + duplicate);
    }
}