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
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode result = new ListNode(0);
        ListNode curr = head;
        ListNode prev = result;
        prev.next = curr;
        while (curr != null) {
            while (curr.next != null && curr.val == curr.next.val){
                curr = curr.next;
            }
            if (prev.next != curr) { //catching duplicates
                prev.next = curr.next; //removing duplicates
                curr = prev.next;  //repositioning the pointer
            }
            else {
                prev =prev.next;
                curr = curr.next;
            }
        }
        return result.next;
    }
}