/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        LinkedList<TreeNode> queue1 = new LinkedList<TreeNode>();
        LinkedList<TreeNode> queue2 = new LinkedList<TreeNode>();
        
        queue1.add(original);
        queue2.add(cloned);
        
        while(queue1.size() != 0){
            TreeNode source = queue1.poll();
            TreeNode cand = queue2.poll();
            
            if(source == target)
                return cand;
            
            if(source.left != null)
                queue1.add(source.left);
            if(source.right != null)
                queue1.add(source.right);
            
            if(cand.left != null)
                queue2.add(cand.left);
            if(cand.right != null)
                queue2.add(cand.right);

        }
        return null;
    }
}