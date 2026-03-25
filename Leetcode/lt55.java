class lt55 {
    public boolean canJump(int[] nums) {
        int maxReach = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) return false;
            maxReach = Math.max(maxReach, i + nums[i]);
        }
        return true;
    }

    // Example usage
    public static void main(String[] args) {
        lt55 solution = new lt55();
        int[] nums = {2,3,1,1,4};
        System.out.println(solution.canJump(nums)); // Output: true
    }
}