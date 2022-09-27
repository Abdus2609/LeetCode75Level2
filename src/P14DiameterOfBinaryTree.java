public class P14DiameterOfBinaryTree {
    
    public static int diameterOfBinaryTree(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int leftDiameter = diameterOfBinaryTree(root.left);
        int rightDiameter = diameterOfBinaryTree(root.right);

        int leftHeight = height(root.left);
        int rightHeight = height(root.left);

        return Math.max(leftHeight + rightHeight, Math.max(leftDiameter, rightDiameter));
    }

    private static int height(TreeNode parent) {

        if (parent == null) {
            return 0;
        }

        return (Math.max(height(parent.left), height(parent.right)) + 1);
    }
}
