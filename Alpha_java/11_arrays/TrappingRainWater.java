public class TrappingRainWater {

    /**
     * Trapping Rain Water Problem:
     * Given an array of integers representing the elevation map where the width of each bar is 1,
     * compute how much water it can trap after raining.
     *
     * Strategy:
     * 1. For each position, the amount of water it can hold is determined by the minimum of
     *    the maximum height to its left and the maximum height to its right, minus the height at that position.
     * 2. We precompute two arrays:
     *    - leftMax[i]: the maximum height from the left up to index i
     *    - rightMax[i]: the maximum height from the right up to index i
     * 3. Then for each index, compute:
     *    water[i] = min(leftMax[i], rightMax[i]) - height[i]
     */

    public static int trap(int[] height) {
        if (height == null || height.length == 0) return 0;

        int n = height.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        // Fill leftMax array
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        // Fill rightMax array
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        // Calculate total water trapped
        int totalWater = 0;
        for (int i = 0; i < n; i++) {
            int waterAtI = Math.min(leftMax[i], rightMax[i]) - height[i];
            totalWater += waterAtI;
        }

        return totalWater;
    }

    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int result = trap(height);
        System.out.println("Total water trapped: " + result);  // Output: 6
    }
}
