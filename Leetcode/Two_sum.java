public class Two_sum {
    /*
==========================================================
LeetCode #2 - Add Two Numbers
==========================================================

Question:

You are given two non-empty linked lists representing two
non-negative integers.

The digits are stored in REVERSE order, and each node contains
a single digit.

Add the two numbers and return the sum as a linked list.

You may assume:
- The two numbers do not contain leading zeros,
  except the number 0 itself.

Example:

Input:
l1 = [2,4,3]
l2 = [5,6,4]

Explanation:
l1 represents 342 (reverse of 243)
l2 represents 465 (reverse of 564)

342 + 465 = 807

Output:
[7,0,8]

==========================================================
*/

/*
 * Definition for singly-linked list.
 */
class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        /*
         * We create a dummy node.
         *
         * Why?
         * It makes handling the head of the answer list much easier.
         * At the end, we simply return dummy.next.
         */
        ListNode dummy = new ListNode(0);

        /*
         * current always points to the last node
         * of the answer linked list.
         */
        ListNode current = dummy;

        /*
         * carry stores the carry generated after
         * adding two digits.
         *
         * Example:
         * 8 + 7 = 15
         * digit = 5
         * carry = 1
         */
        int carry = 0;

        /*
         * Continue until:
         * - l1 is finished
         * - l2 is finished
         * - AND no carry remains
         */
        while (l1 != null || l2 != null || carry != 0) {

            // Take value from l1 if available, otherwise 0
            int x = (l1 != null) ? l1.val : 0;

            // Take value from l2 if available, otherwise 0
            int y = (l2 != null) ? l2.val : 0;

            // Add both digits and carry
            int sum = x + y + carry;

            /*
             * Ones digit becomes the current node.
             *
             * Example:
             * sum = 17
             * node value = 7
             */
            current.next = new ListNode(sum % 10);

            /*
             * Tens digit becomes carry.
             *
             * Example:
             * 17 / 10 = 1
             */
            carry = sum / 10;

            // Move current forward
            current = current.next;

            // Move l1 if possible
            if (l1 != null)
                l1 = l1.next;

            // Move l2 if possible
            if (l2 != null)
                l2 = l2.next;
        }

        /*
         * Skip the dummy node and return the real answer.
         */
        return dummy.next;
    }
}
}
