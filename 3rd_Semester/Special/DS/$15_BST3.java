// 15. Write a program to create a Binary Search Tree and include 
// following operations in tree: 
// a) Insertion b) Count the non­leaf nodes and leaf nodes c) 
// Display height of tree.

class BST1 {
    private class Node {
        private int key;
        private Node left, right;

        private Node(int data) {
            key = data;
        }
    }

    private Node root;

    public void insert(int key) {
        root = insertRec(root, key);
    }

    private Node insertRec(Node root, int key) {
        if (root == null)
            root = new Node(key);

        else if (key < root.key)
            root.left = insertRec(root.left, key);

        else if (key > root.key)
            root.right = insertRec(root.right, key);

        return root;
    }

    public int countNonLeaf() {
        return countNonLeafRec(root);
    }

    private int countNonLeafRec(Node root) {
        if (root == null || root.left == null && root.right == null)
            return 0;
        return 1 + countNonLeafRec(root.left) + countNonLeafRec(root.right);
    }

    public int countLeaf() {
        return countLeafRec(root);
    }

    private int countLeafRec(Node root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 1;
        return countNonLeafRec(root.left) + countNonLeafRec(root.right);
    }
}

public class $15_BST3 {

}
