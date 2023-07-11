public class Main {
    public static void main(String[] args) {

        BinaryTreeImpl binaryTree = new BinaryTreeImpl();

        TreeNode root = binaryTree.createBinaryTree(new int[]{10, 8, 1, 3, 5, 4, -1, -1, 9, -1, -1, -1, -1, -1 , -1});

        InorderTraversal inorderTraversal = new InorderTraversal();
        inorderTraversal.traverseTree(root);
    }
}