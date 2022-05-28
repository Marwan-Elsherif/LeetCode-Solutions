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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null) return null;
        else if(list1 == null) return list2;
        else if(list2 == null) return list1;
        else{
            ListNode theHeadToReturn = new ListNode(-1);
            ListNode currNode = theHeadToReturn;
            while(list1 != null && list2 != null){
                if(list1.val <= list2.val){
                    currNode.next = list1;                   
                    list1 = list1.next;
                }
                else{
                    currNode.next = list2;
                    
                    list2 = list2.next;
                }
                currNode = currNode.next;
            }
            currNode.next = list1 == null? list2:list1;
        return theHeadToReturn.next;
        }
        
    }
}