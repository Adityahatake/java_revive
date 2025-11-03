import java.util.Stack;

public class stack_intro {
    
}
public static void main(String[] args) {
    // Introduction to Stack
    System.out.println("Understanding Stack in Java:");
    System.out.println("A Stack is a LIFO (Last-In-First-Out) data structure");
    System.out.println("Think of it like a stack of plates - you can only add or remove from the top\n");

    // Creating a Stack using built-in Stack class
    Stack<String> bookStack = new Stack<>();

    // Adding elements (push operation)
    System.out.println("Adding books to stack:");
    bookStack.push("Book 1");
    bookStack.push("Book 2");
    bookStack.push("Book 3");
    System.out.println("Stack: " + bookStack);

    // Removing element (pop operation)
    System.out.println("\nRemoving top book: " + bookStack.pop());
    System.out.println("Stack after pop: " + bookStack);

    // Peek operation (view top element without removing)
    System.out.println("\nTop book (peek): " + bookStack.peek());

    // Check if stack is empty
    System.out.println("Is stack empty? " + bookStack.isEmpty());

    // Size of stack
    System.out.println("Number of books in stack: " + bookStack.size());

    // Search for element (returns 1-based position from top)
    System.out.println("Position of 'Book 1' from top: " + bookStack.search("Book 1"));
}