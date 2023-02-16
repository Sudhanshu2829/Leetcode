class Solution {
    public int maxDepth(TreeNode root) {
       if(root==null) return 0;
        int left=1+maxDepth(root.left);
        int right=1+maxDepth(root.right);
     return Math.max(left,right);
    }   
}