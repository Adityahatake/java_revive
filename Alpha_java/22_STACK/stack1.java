import java.util.*;
public class stack1 {
    private static void pushAtBottom(Stack<Integer> s, int value) {
        if (s.isEmpty()) {
            s.push(value);
            return;
        }
        
        int top = s.pop();
        pushAtBottom(s, value);
        s.push(top);
    }

    public static void pushToBottom(Stack<Integer> s) {
        if (s == null || s.isEmpty()) return;
        int top = s.pop();
        pushAtBottom(s, top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s);
    }
}
