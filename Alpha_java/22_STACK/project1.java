import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Scanner;

public class project1 {
    
}
class BrowserHistory {
    private final Deque<String> backStack = new ArrayDeque<>();
    private final Deque<String> forwardStack = new ArrayDeque<>();
    private String current;

    public BrowserHistory(String homepage) {
        this.current = homepage;
    }

    // Visit a new page: push current onto back stack, clear forward stack
    public void visit(String url) {
        if (current != null) backStack.push(current);
        current = url;
        forwardStack.clear();
    }

    // Go back: push current onto forward stack, pop from back stack into current
    public boolean back() {
        if (backStack.isEmpty()) return false;
        forwardStack.push(current);
        current = backStack.pop();
        return true;
    }

    // Go forward: push current onto back stack, pop from forward stack into current
    public boolean forward() {
        if (forwardStack.isEmpty()) return false;
        backStack.push(current);
        current = forwardStack.pop();
        return true;
    }

    public String getCurrent() {
        return current;
    }

    // Return a simple textual view of stacks (top -> bottom)
    public String stacksView() {
        return "Back: " + stackContents(backStack) + "\nForward: " + stackContents(forwardStack);
    }

    private String stackContents(Deque<String> stack) {
        if (stack.isEmpty()) return "[]";
        StringBuilder sb = new StringBuilder("[");
        Iterator<String> it = stack.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}

class BrowserHistoryDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter homepage URL: ");
        String homepage = sc.nextLine().trim();
        if (homepage.isEmpty()) homepage = "about:blank";

        BrowserHistory bh = new BrowserHistory(homepage);
        System.out.println("Current page: " + bh.getCurrent());

        while (true) {
            System.out.println("\nChoose: 1) Visit  2) Back  3) Forward  4) Status  5) Exit");
            System.out.print("Option: ");
            String opt = sc.nextLine().trim();

            switch (opt) {
                case "1":
                case "Visit":
                case "visit":
                    System.out.print("Enter URL to visit: ");
                    String url = sc.nextLine().trim();
                    if (!url.isEmpty()) {
                        bh.visit(url);
                        System.out.println("Visited: " + bh.getCurrent());
                    }
                    break;
                case "2":
                case "Back":
                case "back":
                    if (bh.back()) {
                        System.out.println("Went back to: " + bh.getCurrent());
                    } else {
                        System.out.println("Cannot go back (back stack is empty).");
                    }
                    break;
                case "3":
                case "Forward":
                case "forward":
                    if (bh.forward()) {
                        System.out.println("Went forward to: " + bh.getCurrent());
                    } else {
                        System.out.println("Cannot go forward (forward stack is empty).");
                    }
                    break;
                case "4":
                case "Status":
                case "status":
                    System.out.println("Current: " + bh.getCurrent());
                    System.out.println(bh.stacksView());
                    break;
                case "5":
                case "Exit":
                case "exit":
                    System.out.println("Exiting demo.");
                    sc.close();
                    return;
                default:
                    System.out.println("Unknown option. Try again.");
            }
        }
    }
}