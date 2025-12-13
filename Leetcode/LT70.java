/*
    LeetCode 70 - Climbing Stairs

    Problem:
    You are climbing a staircase with n steps.
    Each time you can climb either 1 step or 2 steps.
    Find the number of distinct ways to reach the top.

    Idea:
    To reach step n:
      - You can come from step (n - 1) by taking 1 step
      - You can come from step (n - 2) by taking 2 steps

    Therefore:
      ways(n) = ways(n - 1) + ways(n - 2)

    This is the Fibonacci pattern.

    Time Complexity: O(n)
    Space Complexity: O(1)
*/

class LT70 {

    public int climbStairs(int n) {

        // Base cases:
        // If there is 1 step -> 1 way
        // If there are 2 steps -> 2 ways (1+1, 2)
        if (n <= 2) {
            return n;
        }

        // prev2 -> number of ways to reach step (i - 2)
        // prev1 -> number of ways to reach step (i - 1)
        int prev2 = 1; // ways to reach step 1
        int prev1 = 2; // ways to reach step 2

        // Start calculating from step 3 up to step n
        for (int i = 3; i <= n; i++) {
            int current = prev1 + prev2; // ways(i) = ways(i-1) + ways(i-2)

            // Move forward for next iteration
            prev2 = prev1;
            prev1 = current;
        }

        // prev1 now holds the number of ways to reach step n
        return prev1;
    }
}
