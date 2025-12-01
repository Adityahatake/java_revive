class Solutionlt31 {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        
        int i = n - 2;

        // Step 1: Find the first index i where nums[i] < nums[i+1] (from right to left)
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        

        // Step 2: If such index found, find j (from right) such that nums[j] > nums[i]
        if (i >= 0) {
            int j = n - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }

        // Step 3: Reverse the suffix starting at i+1
        reverse(nums, i + 1, n - 1);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}
