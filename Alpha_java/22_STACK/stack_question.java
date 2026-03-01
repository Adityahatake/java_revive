public class stack_question {
    public static void main(String[] args) {
        // Question 1: Implement a simple stack using array
        System.out.println("=== Stack Questions ===\n");
        
        // Question 1: Check if parentheses are balanced
        System.out.println("Q1: Check Balanced Parentheses");
        String expr = "{[()]}";
        System.out.println("Input: " + expr);
        System.out.println("Output: " + isBalanced(expr) + "\n");
        
        // Question 2: Reverse a string using stack
        System.out.println("Q2: Reverse String using Stack");
        String str = "Hello";
        System.out.println("Input: " + str);
        System.out.println("Output: " + reverseString(str) + "\n");
        
        // Question 3: Next Greater Element
        System.out.println("Q3: Next Greater Element");
        int[] arr = {1, 5, 0, 3, 4, 5};
        System.out.println("Input: " + java.util.Arrays.toString(arr));
        System.out.println("Output: " + java.util.Arrays.toString(nextGreaterElement(arr)));
    }

    static boolean isBalanced(String s) {
        java.util.Stack<Character> stack = new java.util.Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') stack.push(c);
            else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((c == '}' && top != '{') || (c == ']' && top != '[') || (c == ')' && top != '('))
                    return false;
            }
        }
        return stack.isEmpty();
    }

    static String reverseString(String s) {
        java.util.Stack<Character> stack = new java.util.Stack<>();
        for (char c : s.toCharArray()) stack.push(c);
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) result.append(stack.pop());
        return result.toString();
    }

    static int[] nextGreaterElement(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        java.util.Stack<Integer> stack = new java.util.Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) stack.pop();
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }
        return result;
    }
}
