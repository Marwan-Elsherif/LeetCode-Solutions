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
    public ListNode mergeNodes(ListNode head) {
        ListNode newListNode = new ListNode(0);
        ListNode dummy = newListNode;
        ListNode newHead = newListNode;
        // newHead = dummy;
        
        while(head != null && head.next != null){
            if(head.val == 0){
                int tempVal = 0;
                head = head.next;
                while(head != null && head.val != 0){
                    tempVal += head.val;
                    head = head.next;
                }
                // tempVal += head.val;
                newHead.next = new ListNode(tempVal);
                newHead = newHead.next;
            }
            
            // head = head.next;
        }
        return dummy.next; 
        
    }
}