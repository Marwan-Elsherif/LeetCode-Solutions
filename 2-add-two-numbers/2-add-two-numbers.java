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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode answerNode = new ListNode();
        ListNode dummy = answerNode;
        boolean carry = false;
        while(l1 != null && l2 != null){
            int op1 = l1.val;
            int op2 = l2.val;
            int newNodeVal;
            int carryValue = carry? 1:0;
            if(op1+op2+carryValue >= 10){
                carry = true;
                newNodeVal = (op1+op2+carryValue) % 10;
            }
            else{
                carry = false;
                newNodeVal = op1 + op2 + carryValue;
            }
            ListNode temp = new ListNode(newNodeVal);
            answerNode.next = temp;
            l1 = l1.next;
            l2 = l2.next;
            answerNode = answerNode.next;
        }
         while(l1 != null){
            int op1 = l1.val;
            int newNodeVal;
            int carryValue = carry? 1:0;
            if(op1+carryValue >= 10){
                carry = true;
                newNodeVal = (op1+carryValue) % 10;
            }
            else{
                carry = false;
                newNodeVal = op1 + carryValue;
            }
            ListNode temp = new ListNode(newNodeVal);
            answerNode.next = temp;
            l1 = l1.next;
            answerNode = answerNode.next;
        }
        while(l2 != null){
            int op2 = l2.val;
            int newNodeVal;
            int carryValue = carry? 1:0;
            if(op2+carryValue >= 10){
                carry = true;
                newNodeVal = (op2+carryValue) % 10;
            }
            else{
                carry = false;
                newNodeVal = op2 + carryValue;
            }
            ListNode temp = new ListNode(newNodeVal);
            answerNode.next = temp;
            l2 = l2.next;
            answerNode = answerNode.next;
        }
        if (carry) {
            answerNode.next = new ListNode(1);
        }
        return dummy.next;
    }
}