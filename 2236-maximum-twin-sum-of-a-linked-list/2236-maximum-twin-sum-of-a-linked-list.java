/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    static ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        ListNode agla = null;
        while(curr!=null){
            agla = curr.next;
            curr.next = prev;
            prev = curr;
            curr = agla;
        }
        return prev;
    }

    public int pairSum(ListNode head) {
        int max = Integer.MIN_VALUE;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode temp = reverse(slow.next);
        slow.next = temp;
        while(temp!=null){
            if(head.val+temp.val>max){
                max = head.val+temp.val;
            }
            else{
                head = head.next;
                temp = temp.next;
            }            
        }
        return max;
    }
}