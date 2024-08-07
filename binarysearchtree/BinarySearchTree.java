package binarysearchtree;

public class BinarySearchTree {
    BSTNode root;

    public BinarySearchTree() {
        this.root = null;
    }

    public BinarySearchTree(int value) {
        this.root = new BSTNode(value);
    }

    public void insert(int value) {
        BSTNode newNode = new BSTNode(value);

        if (this.root == null) {
            this.root = newNode;
            return;
        }

        BSTNode current = this.root;
        while (true) {
            if (value == current.value) {
                return;
            }
            if (value < current.value) {
                if (current.left == null) {
                    current.left = newNode;
                    return;
                }
                current = current.left;
            } else {
                if (current.right == null) {
                    current.right = newNode;
                    return;
                }
                current = current.right;
            }
        }
    }

    public void print() {
        // Print tree
        PrintTree printer = new PrintTree();
        printer.print(this.root);
    }

}
