    class questions {

        public static void main(String[] args) {
            questions q = new questions();
            // Example usage:
            int[] nums = {2, 7, 11, 15};
            int target = 9;
            int[] result = q.twoSum(nums, target);
            System.out.println("Two Sum Result: " + java.util.Arrays.toString(result));
        }
        
        // 1. Two Sum
        public int[] twoSum(int[] nums, int target) {
            java.util.Map<Integer, Integer> map = new java.util.HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];
                if (map.containsKey(complement)) {
                    return new int[]{map.get(complement), i};
                }
                map.put(nums[i], i);
            }
            return new int[]{};
        }
        
        // 2. Reverse String
        public void reverseString(char[] s) {
            int left = 0, right = s.length - 1;
            while (left < right) {
                char temp = s[left];
                s[left] = s[right];
                s[right] = temp;
                left++;
                right--;
            }
        }
        
        // 3. Valid Parentheses
        public boolean isValid(String s) {
            java.util.Stack<Character> stack = new java.util.Stack<>();
            for (char c : s.toCharArray()) {
                if (c == '(') stack.push(')');
                else if (c == '{') stack.push('}');
                else if (c == '[') stack.push(']');
                else if (stack.isEmpty() || stack.pop() != c) return false;
            }
            return stack.isEmpty();
        }
        
        // 4. Palindrome Number
        public boolean isPalindrome(int x) {
            if (x < 0) return false;
            int original = x, reversed = 0;
            while (x > 0) {
                reversed = reversed * 10 + x % 10;
                x /= 10;
            }
            return original == reversed;
        }
        
        // 5. Merge Sorted Array
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int p1 = m - 1, p2 = n - 1, p = m + n - 1;
            while (p1 >= 0 && p2 >= 0) {
                nums1[p--] = nums1[p1] > nums2[p2] ? nums1[p1--] : nums2[p2--];
            }
            while (p2 >= 0) {
                nums1[p--] = nums2[p2--];
            }
        }
    }
    

