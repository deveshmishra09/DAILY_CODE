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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = head;
        ListNode curr = head;

       
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        curr = slow;
        ListNode temp = curr;
        ListNode tail = null;
        while(temp != null){
            ListNode newNode = new ListNode(temp.val);
            newNode.next = tail;
            tail = newNode;
            temp = temp.next;
        }

        temp = tail;

        while(prev != null && temp != null){
            int node1 = prev.val;
            int node2 = temp.val;
            if(node1 == node2){
                prev = prev.next;
                temp = temp.next;
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
}