import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeImpl {

    public TreeNode createBinaryTree(int[] nodes) {
        if (nodes.length == 0 || nodes[0] == -1) {
            return null;
        }

        TreeNode root = new TreeNode(nodes[0]);

        Queue<TreeNode> storeNodes = new LinkedList<>();
        storeNodes.add(root);

        for (int i = 1; i < nodes.length; i++) {
            TreeNode parent = storeNodes.remove();
            if (nodes[i] != -1) {
                parent.left = new TreeNode(nodes[i]);
                storeNodes.add(parent.left);
            }
            if (nodes[++i] != -1) {
                parent.right = new TreeNode(nodes[i]);
                storeNodes.add(parent.right);
            }
        }
        return root;
    }
}