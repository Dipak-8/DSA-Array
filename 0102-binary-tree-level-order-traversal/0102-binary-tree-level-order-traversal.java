/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> answer = new LinkedList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        if(root == null)
            return answer;

        queue.offer(root);
        while(!queue.isEmpty()) {
            List<Integer> temp = new LinkedList<Integer>();

            int level = queue.size();
            for(int i=0; i<level; i++) {
                TreeNode node = queue.peek();
                if(node.left != null)
                    queue.offer(node.left);
                if(node.right != null)
                    queue.offer(node.right);
                
                temp.add(queue.poll().val);
            }
            answer.add(temp);
        }
        return answer;
    }
}