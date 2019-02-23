package FlattenBinaryTreetoLinkedListPackage;

import java.util.ArrayList;
import java.util.List;

public class FlattenBinaryTreeToLinkedList {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(6);
        flatten(root);
        printTreeNode(root);
    }

    private static List<Integer> tempList = new ArrayList<>();
    public static void flatten(TreeNode root) {
        if (root == null) {
            return ;
        }
        prefix(root);
        TreeNode newRoot = new TreeNode(tempList.get(0));
        TreeNode temp = newRoot;
        for (int i = 1; i < tempList.size(); i ++) {
            temp.right = new TreeNode(tempList.get(i));
            temp = temp.right;
        }

        root.left = null;
        root.right = newRoot.right;
    }

    public static void prefix(TreeNode node) {
        tempList.add(node.val);
        if (node.left != null) {
            prefix(node.left);
        }
        if (node.right != null) {
            prefix(node.right);
        }
    }

    public static void printTreeNode(TreeNode node) {
        System.out.println(node.val);
        if (node.right != null) {
            System.out.println("right ");
            printTreeNode(node.right);
        }
    }
}
