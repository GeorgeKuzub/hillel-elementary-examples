package datastructure.binarytree;

public class BinaryTree {
    private Node root;


    public Node getRoot() {
        return root;
    }

    public void add(int data) {
        Node n = new Node(data);

        if (root == null) {
            root = n;
            return;
        }

        Node parent;
        Node current = root;

        while (true) {
            parent = current;

            if (data < current.getData()) {
                current = current.getLeft();
            } else {
                current = current.getRight();
            }

            if (current == null) {
                break;
            }
        }

        if (data < parent.getData()) {
            parent.setLeft(n);
        } else {
            parent.setRight(n);
        }

    }

    public Node find(int data) {
        if (root == null) {
            return null;
        }

        Node current = root;

        while (current != null) {
            if (current.getData() == data) {
                return current;
            }

            if (data < current.getData()) {
                current = current.getLeft();
            } else {
                current = current.getRight();
            }

        }

        return null;
    }

    public boolean remove() {
        return true;
    }

    public int getMaxValue() {
        Node current = root;

        while (current.getRight() != null) {
            current = current.getRight();
        }
        return current.getData();
    }

    public int getMinValue() {
        Node current = root;

        while (current.getLeft() != null) {
            current = current.getLeft();
        }
        return current.getData();
    }

    public void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.getLeft());
        node.show();
        inOrder(node.getRight());
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.add(30);
        binaryTree.add(20);
        binaryTree.add(45);
        binaryTree.add(15);
        binaryTree.add(25);
        binaryTree.add(40);
        binaryTree.add(60);
        binaryTree.add(5);
        binaryTree.add(17);
        binaryTree.add(22);
        binaryTree.add(28);
        binaryTree.add(35);
        binaryTree.add(43);
        binaryTree.add(57);
        binaryTree.add(90);

        binaryTree.inOrder(binaryTree.getRoot());
    }

}
