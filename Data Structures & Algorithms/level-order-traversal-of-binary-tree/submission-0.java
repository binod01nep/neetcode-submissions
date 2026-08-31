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
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()&&root!=null){
            List<Integer> temp=new ArrayList<>();
            int n=q.size();
            while(n>0){
                TreeNode top=q.peek();
                temp.add(top.val);
                if(top.left!=null) q.add(top.left);
                if(top.right!=null) q.add(top.right);
                q.remove();
                n--;
            }
            ans.add(temp);
        }
        return ans;
    }
}
