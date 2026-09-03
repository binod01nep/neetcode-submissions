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
    static TreeNode ans=null;
    static int lca(TreeNode root, TreeNode p, TreeNode q){
        if(root==null) return 0;
        int left=lca(root.left,p,q);
        int right=lca(root.right,p,q);
        int self=0;
        if(root==p||root==q){ self=1;}
        int total=left+right+self;
        if(total==2&&ans==null){
            ans=root;
        }
        return total;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
       ans=null;
        lca(root,p,q);
        return ans;
    }
}
