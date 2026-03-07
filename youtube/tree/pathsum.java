package youtube.tree;
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        // 1. If we hit a null, this path failed
        if (root == null) return false;

        // 2. If it's a leaf node, check if the remaining sum matches its value
        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }

        // 3. Otherwise, keep going down, subtracting the current value
        int newTarget = targetSum - root.val;
        return hasPathSum(root.left, newTarget) || hasPathSum(root.right, newTarget);
    }
}