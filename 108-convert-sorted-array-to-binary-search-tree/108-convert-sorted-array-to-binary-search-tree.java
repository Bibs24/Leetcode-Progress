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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0) return null;
        return formBST(nums,0,nums.length-1);
    }
    public TreeNode formBST(int[] nums, int start,int end){
        if(start > end) return null;
        int midp = start + (end -start)/2;
        TreeNode n = new TreeNode(nums[midp]);
        n.left = formBST(nums,start,midp-1);
        n.right = formBST(nums,midp+1,end);
        return n;
        
    }
}