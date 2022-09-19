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
    public int pairSum(ListNode head) {
        ListNode runner = head, temp = head;
        Stack<Integer> stack = new Stack<>();
        
        while(runner != null){
            stack.push(temp.val);
            temp = temp.next;
            runner = runner.next.next;
        }

        int maxSum = 0;
        while(!stack.isEmpty()){
            maxSum = Math.max(maxSum, stack.pop() + temp.val);
            temp = temp.next;
        }
        return maxSum;
    }
}