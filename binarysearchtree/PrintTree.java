package binarysearchtree;

class PrintTree {
    // Function to print binary tree
    public void print(BSTNode root) {

        System.out.println(">>>Binary Search Tree Data:");

        int height = height(root);
        for (int i = 1; i <= height; i++) {
            printLevel(root, i, height);
            System.out.println();
        }
    }

    // Function to print nodes at a given level
    private void printLevel(BSTNode root, int level, int totalHeight) {
        if (root == null) {
            printSpaces((int) Math.pow(2, totalHeight - level + 1) - 1);
            return;
        }
        if (level == 1) {
            printSpaces((int) Math.pow(2, totalHeight - level + 1) - 1);
            System.out.print(root.value);
            printSpaces((int) Math.pow(2, totalHeight - level + 2) - 2);
        } else if (level > 1) {
            printLevel(root.left, level - 1, totalHeight);
            printLevel(root.right, level - 1, totalHeight);
        }
    }

    // Function to calculate height of tree
    private int height(BSTNode root) {
        if (root == null)
            return 0;
        else {
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);

            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

    // Function to print spaces
    private void printSpaces(int count) {
        for (int i = 0; i < count; i++)
            System.out.print(" ");
    }
}
