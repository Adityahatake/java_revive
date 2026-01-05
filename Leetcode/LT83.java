/*
    LeetCode 83 - Remove Duplicates from Sorted List

    Problem:
    Given the head of a sorted linked list,
    delete all duplicates such that each element appears only once.
    Return the linked list sorted as well.

    Example:
    Input:  1 -> 1 -> 2 -> 3 -> 3
    Output: 1 -> 2 -> 3
*/

/* Definition for singly-linked list. */
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}


/* ============================
   Solution 1: Iterative Approach
   ============================

   Idea:
   - Traverse the list using a pointer
   - If current node value == next node value,
     skip the next node
   - Otherwise, move forward

   Time Complexity: O(n)
   Space Complexity: O(1)
*/
class SolutionIterative {

    public ListNode deleteDuplicates(ListNode head) {

        ListNode current = head;

        while (current != null && current.next != null) {

            // If duplicate found, skip the next node
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                // Move to next node if no duplicate
                current = current.next;
            }
        }

        return head;
    }
}


/* ============================
   Solution 2: Recursive Approach
   ============================

   Idea:
   - Recursively process the rest of the list
   - If current node value == next node value,
     skip current node
   - Otherwise, keep it

   Time Complexity: O(n)
   Space Complexity: O(n)  (recursion stack)
*/
class SolutionRecursive {

    public ListNode deleteDuplicates(ListNode head) {

        // Base case: empty list or single node
        if (head == null || head.next == null) {
            return head;
        }

        // Recursively process the rest of the list
        head.next = deleteDuplicates(head.next);

        // If current node is duplicate, skip it
        if (head.val == head.next.val) {
            return head.next;
        } else {
            return head;
        }
    }
}
