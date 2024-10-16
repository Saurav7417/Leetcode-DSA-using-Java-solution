/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        // Initialize slow and fast pointers
        ListNode fast = head;
        ListNode slow = head;
        fast=fast.next.next;
        slow=slow.next;
        while(fast != null && fast.next != null){
          fast=fast.next.next;
        slow=slow.next;
        if(fast==slow){
            return true;
        }
        }
        return false;
    }
}