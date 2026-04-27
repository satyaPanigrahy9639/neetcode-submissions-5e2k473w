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
        ListNode slow = head;
        ListNode fast = head;
        ListNode res = null;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        //these two pointers are at where we start to reverse
        ListNode p1 = slow;
        ListNode p2 = slow.next;
        while (p2 != null && p2.next != null){
            ListNode p3 = p2.next;
            p2.next = p3.next;
            p3.next = p1.next;
            p1.next = p3;
        }
        ListNode l1 = head;
        ListNode l2 = p1;
        ListNode l3 = p1.next;
        while (l3 != null){
            l2.next = l3.next;
            l3.next = l1.next;
            l1.next = l3;
            l1 = l3.next;
            l3 = l2.next;
        }
    }
}
