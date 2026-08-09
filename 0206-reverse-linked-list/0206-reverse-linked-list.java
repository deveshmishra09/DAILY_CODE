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
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode left = head;
        ListNode middle = head.next;
        ListNode right = head.next.next;

        left.next = null;

        while(right != null){
            middle.next = left;
            left = middle;
            middle = right;
            right = right.next;
        }

        middle.next = left;
        head = middle;
        
        return head;
    }
}