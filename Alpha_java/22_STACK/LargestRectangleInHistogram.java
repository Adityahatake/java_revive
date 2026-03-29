// Input: heights = [2,1,5,6,2,3]
// Output: 10
// Explanation: The largest rectangle has width 5 and height 2 (from index 2 to 6)


public class LargestRectangleInHistogram {
    public static int largestRectangleArea(int[] heights) {
        if (heights == null || heights.length == 0) return 0;
        
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int index = 0;
        
        while (index < heights.length) {
            if (stack.isEmpty() || heights[index] >= heights[stack.peek()]) {
                stack.push(index);
                index++;
            } else {
                int top = stack.pop();
                int width = stack.isEmpty() ? index : index - stack.peek() - 1;
                int area = heights[top] * width;
                maxArea = Math.max(maxArea, area);
            }
        }
        
        while (!stack.isEmpty()) {
            int top = stack.pop();
            int width = stack.isEmpty() ? index : index - stack.peek() - 1;
            int area = heights[top] * width;
            maxArea = Math.max(maxArea, area);
        }
        
        return maxArea;
    }
    
    public static void main(String[] args) {
        int[] heights = {2, 1, 5, 6, 2, 3};
        System.out.println(largestRectangleArea(heights)); // Output: 10
    }
}