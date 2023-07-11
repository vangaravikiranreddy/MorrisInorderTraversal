public class InorderTraversal {

    public TreeNode getRightMostNode(TreeNode root) {
      TreeNode temp = root.left;

      while (temp.right != null && temp.right != root) {
          temp = temp.right;
      }
      return temp;
    }
    public void traverseTree(TreeNode root) {
        TreeNode curNode = root;

        while (curNode != null) {
            if (curNode.left == null) {
                System.out.print(curNode.value+" ");
                curNode = curNode.right;
            } else {
                TreeNode rightNode = getRightMostNode(curNode); // getting the right most node from left sub tree
                if (rightNode.right == null) {
                    rightNode.right = curNode;
                    curNode = curNode.left;
                } else {
                    rightNode.right = null;
                    System.out.print(curNode.value+" ");
                    curNode = curNode.right;
                }
            }
        }
    }
}
