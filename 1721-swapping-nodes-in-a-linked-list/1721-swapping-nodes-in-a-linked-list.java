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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first=head, sec=head, third=head;
        
        for(int i=1; i<k; i++){
            sec = sec.next;
            third = third.next;
        }
        
        while(third.next != null){
            first = first.next;
            third = third.next;
        }
        
        int temp = first.val;
        first.val = sec.val;
        sec.val = temp;
        
        return head;
    }
}