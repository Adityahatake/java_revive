
public class question {
    // Define the Node class for linked list
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Question 1: Reverse a Linked List
    // Description: Given the head of a singly linked list, reverse the list and return the reversed list.
    // Approach: Use three pointers (prev, curr, next) to iteratively reverse the links. Time: O(n), Space: O(1).
    public static Node reverseList(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    // Question 2: Detect Cycle in Linked List
    // Description: Given the head of a linked list, determine if the list has a cycle.
    // Approach: Use Floyd's Tortoise and Hare algorithm with two pointers moving at different speeds. Time: O(n), Space: O(1).
    public static boolean hasCycle(Node head) {
        if (head == null) return false;
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // Test reverseList
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        Node reversed = reverseList(head1);
        System.out.print("Reversed: ");
        printList(reversed);

        // Test hasCycle
        Node head2 = new Node(1);
        head2.next = new Node(2);
        head2.next.next = head2; // cycle
        System.out.println("Has cycle: " + hasCycle(head2));

        // Test middleNode
        Node head3 = new Node(1);
        head3.next = new Node(2);
        head3.next.next = new Node(3);
        head3.next.next.next = new Node(4);
        Node middle = middleNode(head3);
        System.out.println("Middle: " + middle.data);

        // Test mergeTwoLists
        Node l1 = new Node(1);
        l1.next = new Node(3);
        Node l2 = new Node(2);
        l2.next = new Node(4);
        Node merged = mergeTwoLists(l1, l2);
        System.out.print("Merged: ");
        printList(merged);

        // Test removeNthFromEnd
        Node head4 = new Node(1);
        head4.next = new Node(2);
        head4.next.next = new Node(3);
        Node removed = removeNthFromEnd(head4, 2);
        System.out.print("After remove 2nd from end: ");
        printList(removed);
    }

    // Helper method to print list
    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    // Question 3: Find Middle of Linked List
    // Description: Given the head of a singly linked list, return the middle node. If there are two middle nodes, return the second one.
    // Approach: Use two pointers, slow moves one step, fast moves two steps. Time: O(n), Space: O(1).
    public static Node middleNode(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Question 4: Merge Two Sorted Linked Lists
    // Description: Merge two sorted linked lists and return it as a sorted list.
    // Approach: Use a dummy node and two pointers to compare and merge. Time: O(n + m), Space: O(1).
    public static Node mergeTwoLists(Node l1, Node l2) {
        Node dummy = new Node(0);
        Node curr = dummy;
        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        curr.next = (l1 != null) ? l1 : l2;
        return dummy.next;
    }

    // Question 5: Remove Nth Node From End of List
    // Description: Given the head of a linked list, remove the nth node from the end of the list and return its head.
    // Approach: Use two pointers with a gap of n. Time: O(n), Space: O(1).
    public static Node removeNthFromEnd(Node head, int n) {
        Node dummy = new Node(0);
        dummy.next = head;
        Node first = dummy;
        Node second = dummy;
        for (int i = 0; i <= n; i++) {
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }
}