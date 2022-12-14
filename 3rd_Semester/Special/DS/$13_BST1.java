// 13. Write a program to create a Binary Search Tree and include 
// following operations in tree: 
// (a) Insertion (b)Deletion (c) Search a no. in BST

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

    public void inorder() {
        inorderRec(root);
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key + " ");
            inorderRec(root.right);
        }
    }

    public void delete(int key) {
        root = deleteRec(root, key);
    }

    private Node deleteRec(Node root, int key) {
        if (root == null)
            return root;
        if (key < root.key)
            root.left = deleteRec(root.left, key);
        else if (key > root.key)
            root.right = deleteRec(root.right, key);

        else {
            if (root.left == null)
                return root.right;
            if (root.right == null)
                return root.left;

            root.key = minValue(root.right);

            root.right = deleteRec(root.right, root.key);
        }

        return root;
    }

    private int minValue(Node root) {
        int minv = root.key;
        while (root.left != null) {
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }

    public boolean search(int key) {
        return searchRec(root, key).key == key;
    }

    private Node searchRec(Node root, int key) {
        if (root == null || root.key == key)
            return root;
        if (root.key > key)
            return searchRec(root.left, key);
        return searchRec(root.right, key);
    }

}

public class $13_BST1 {

}
