package LeetCodePt2;


// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class isBalancedTree {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;

        int leftSubTreeDepth = findDepth(root.left);
        int rightSubTreeDepth = findDepth(root.right);

        return Math.abs(leftSubTreeDepth - rightSubTreeDepth) <= 1 && isBalanced(root.left) && isBalanced(root.right);

    }

    private int findDepth(TreeNode node) {
        if(node == null) return 0;

        int leftDepth = findDepth(node.left);
        int rightDepth = findDepth(node.right);

        return 1 + Math.max(leftDepth, rightDepth);
    }
}
