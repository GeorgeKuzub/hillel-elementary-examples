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

    public boolean remove(int data) {
        if (root == null) return false;

        Node current = root;
        Node parent = root;
        boolean isLeftChild = true;

        while (true) {
            if (current.getData() == data) {
                break;
            }

            parent = current;

            if (data < current.getData()) {
                current = current.getLeft();
                isLeftChild = true;
            } else {
                current = current.getRight();
                isLeftChild = false;
            }

            if (current == null) {
                return false;
            }
        }

        if (current.getLeft() == null && current.getRight() == null) {
            if (current == root) {
                root = null;
            } else if (isLeftChild) {
                parent.setLeft(null);
            } else {
                parent.setRight(null);
            }
        }


        if (current.getRight() == null) {
            if (current == root) {
                root = current.getLeft();
            } else if (isLeftChild) {
                parent.setLeft(current.getLeft());
            } else {
                parent.setRight(current.getLeft());
            }
        } else if (current.getLeft() == null) {
            if (current == null) {
                root = root.getRight();
            } else if (isLeftChild) {
                parent.setLeft(current.getRight());
            } else {
                parent.setRight(current.getRight());
            }
        }



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

    public void reverseOrder(Node node) {
        if (node == null) {
            return;
        }
        reverseOrder(node.getRight());
        node.show();
        reverseOrder(node.getLeft());
    }

    public void preOrder(Node node) {
        if (node == null) {
            return;
        }
        node.show();
        inOrder(node.getLeft());
        inOrder(node.getRight());
    }

    public void postOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.getLeft());
        inOrder(node.getRight());
        node.show();
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

        System.out.println("In order traverse:");
        binaryTree.inOrder(binaryTree.getRoot());

        System.out.println("\nReverse order");
        binaryTree.reverseOrder(binaryTree.getRoot());

        System.out.println("\nMax element:");
        System.out.println(binaryTree.getMaxValue());

        System.out.println("\nMin element: ");
        System.out.println(binaryTree.getMinValue());

        System.out.println("Trying to find exist element element:");
        System.out.println(binaryTree.find(60));

        System.out.println("Trying to find not exist element: ");
        System.out.println(binaryTree.find(1000));

        System.out.println("Trying to remove an element, a leaf or last element that" +
                "has only one child: ");
        binaryTree.remove(90);
        System.out.println("and show again (in reverse order) the new tree below: ");
        binaryTree.reverseOrder(binaryTree.getRoot());
    }

}
