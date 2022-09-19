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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp=list1, runner=null;
        
        int sec = b - a + 2;
        while(a > 1){
            temp = temp.next;
            a--;
        }
        
        runner = temp;
        while(sec > 0){
            runner = runner.next;
            sec--;
        }
        temp.next = list2;
        
        while(list2.next != null)
            list2 = list2.next;
        
        list2.next = runner;
        
        return list1;
    }
}