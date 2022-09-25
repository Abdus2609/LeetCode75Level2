public class P13BalancedBinaryTree {
    
    public static boolean isBalanced(TreeNode root) {

        if (root == null) {
            return true;
        }

        return calculateHeight(root) != -1;
    }

    private static int calculateHeight(TreeNode parent) {
        if (parent == null) {
            return 0;
        }

        int left = calculateHeight(parent.left);
        int right = calculateHeight(parent.right);

        if (left == -1 || right == -1 || Math.abs(left - right) > 1) {
            return -1;
        }

        return Math.max(left, right) + 1;
    }
}
