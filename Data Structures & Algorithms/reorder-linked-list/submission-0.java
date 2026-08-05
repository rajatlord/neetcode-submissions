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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
        return;
        }
        ListNode slow = head;
        ListNode fast = head;

            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
        ListNode second = slow.next;
        slow.next = null;
        ListNode prev = null;
        ListNode curr = second;
        ListNode next = null;
        
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }   
        // prev =head ;
        ListNode p1 = head;
        ListNode p2 = prev;
        ListNode next1;
        ListNode next2;
        while(p2 != null){
            next1 = p1.next;
            next2 = p2.next;
            p1.next = p2;
            p2.next = next1;

            p1 = next1;
            p2 = next2;
        }
        return;
    }
}
