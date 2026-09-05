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
    static TreeNode ans=null;
    static void lca(TreeNode root, int p, int q){
        if(root==null) return;
        if(root.val==p&&root.val==q){
            ans=root;
            return;
        }
        else if(root.val>p&&root.val>q){
            lca(root.left,p,q);
        }
        else if(root.val<p&&root.val<q){
            lca(root.right,p,q);
        }
        else{
            ans=root;
        }
        return;

    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        lca(root,p.val,q.val);
        return ans;
    }
}